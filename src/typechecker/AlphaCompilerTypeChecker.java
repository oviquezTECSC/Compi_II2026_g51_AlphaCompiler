package typechecker;

import org.antlr.v4.runtime.Token;
import syntaxchecker.generated.AlphaCompilerBaseVisitor;
import syntaxchecker.generated.AlphaCompilerLexer;
import syntaxchecker.generated.AlphaCompilerParser;

import java.util.LinkedList;

public class AlphaCompilerTypeChecker extends AlphaCompilerBaseVisitor<Object> {
    private LinkedList<String> errorList;
    private TablaSimbolos symbolTable;

    public AlphaCompilerTypeChecker() {
        this.errorList = new LinkedList<>();
        this.symbolTable=new TablaSimbolos();
    }

    public boolean hasErrors(){
        return this.errorList.size()>0;
    }

    public LinkedList<String> getErrorList() {
        return errorList;
    }

    private void reportError(String msj, Token offendingToken){
        this.errorList.add(
                "TYPE ERROR: " +
                        msj+ " \""+ offendingToken.getText() + "\""+
                        " (line: "+
                        offendingToken.getLine()+
                        " , column: "+
                        (offendingToken.getCharPositionInLine()+1)+
                        ")"
        );
    }

    //todo: otro reportError pero que reciba también dos tipos de datos (int)
    //todo: aquellas llamas donde se requiera más info (tipos), cambiarlas por este nuevo reportError

    @Override
    public Object visitProgram(AlphaCompilerParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitCommand(AlphaCompilerParser.CommandContext ctx) {
        return super.visitCommand(ctx);
    }

    @Override
    public Object visitAssignSingleCommand(AlphaCompilerParser.AssignSingleCommandContext ctx) {
        try {
            int exprType = (int) visit(ctx.expression());
            TablaSimbolos.Ident ident = this.symbolTable.buscar(ctx.ID().getText());
            if (ident != null) {
                if (!(ident instanceof TablaSimbolos.MethodIdent)) {
                    if (((TablaSimbolos.VarIdent) ident).isConstant == false) {
                        if (ident.type != exprType)
                            reportError("Incompatible types in assign!", ctx.ID().getSymbol());
                        //todo: hacer un método polimórfico para reportError que incluya tipos incompatibles
                    } else
                        reportError("Cannot assign to constant definition!!!", ctx.ID().getSymbol());
                } else
                    reportError("Cannot assign to method definition!!!", ctx.ID().getSymbol());
            } else
                reportError("Undefined identifier!!!", ctx.ID().getSymbol());
        }catch(TypeCheckerException e){
            //podriamos considerar hacer otras verificaciones si fuera del caso
        }

        return null;
    }

    @Override
    public Object visitMethodCallSingleCommand(AlphaCompilerParser.MethodCallSingleCommandContext ctx) {
        //todo: verificar que exista y sea método y que la cantidad y los tipos de los argumentos coincidan con la declaración
        return super.visitMethodCallSingleCommand(ctx);
    }

    @Override
    public Object visitReturnSingleCommand(AlphaCompilerParser.ReturnSingleCommandContext ctx) {
        // todo: verifica que el tipo de la expresión coincida con el tipo de retorno AL QUE PERTENEXCA ESTE RETURN ***
        //TODO: no puede haber un return si no es en un método y toda función debe garantizar return completo
        return super.visitReturnSingleCommand(ctx);
    }

    @Override
    public Object visitIfSingleCommand(AlphaCompilerParser.IfSingleCommandContext ctx) {
        //todo: el tipo de la expresión debe ser bool
        return super.visitIfSingleCommand(ctx);
    }

    @Override
    public Object visitWhileSingleCommand(AlphaCompilerParser.WhileSingleCommandContext ctx) {
        //todo: el tipo de la expresión debe ser bool
        return super.visitWhileSingleCommand(ctx);
    }

    @Override
    public Object visitLetSingleCommand(AlphaCompilerParser.LetSingleCommandContext ctx) {
        this.symbolTable.openScope();
        visit(ctx.declaration());
        this.symbolTable.imprimir();
        visit(ctx.singleCommand());
        this.symbolTable.closeScope();
        return null;
    }

    @Override
    public Object visitBlockSingleCommand(AlphaCompilerParser.BlockSingleCommandContext ctx) {
        return super.visitBlockSingleCommand(ctx);
    }

    @Override
    public Object visitArgumentList(AlphaCompilerParser.ArgumentListContext ctx) {
        //todo: devolver lo necesario (Lista de números) para que funcione el methodCall
        return super.visitArgumentList(ctx);
    }

    @Override
    public Object visitDeclaration(AlphaCompilerParser.DeclarationContext ctx) {
        return super.visitDeclaration(ctx);
    }

    @Override
    public Object visitConstSingleDeclaration(AlphaCompilerParser.ConstSingleDeclarationContext ctx) {
        int exprType = (int) visit(ctx.expression());
        TablaSimbolos.Ident ident = this.symbolTable.buscarNivelActual(ctx.ID().getText());
        if(ident==null)
            this.symbolTable.insertar(ctx.ID().getSymbol(),exprType,true,ctx);
        else {
            if (ident instanceof TablaSimbolos.MethodIdent)
                this.symbolTable.insertar(ctx.ID().getSymbol(),exprType,true,ctx);
            else
                reportError("Constant name already defined!", ctx.ID().getSymbol());
        }
        return null;
    }

    private int verifyType(String text){
        if (text.equals("int"))
            return 0;
        else if (text.equals("char"))
            return 1;
        else if (text.equals("bool"))
            return 2;
        else if (text.equals("string"))
            return 3;
        else
            return -1;
    }
    @Override
    public Object visitVarSingleDeclaration(AlphaCompilerParser.VarSingleDeclarationContext ctx) {
        Token type = (Token) visit(ctx.typeDenoter());
        int tipo = verifyType(type.getText());
        if (tipo!=-1){
            TablaSimbolos.Ident ident = this.symbolTable.buscarNivelActual(ctx.ID().getText());
            if(ident==null)
                this.symbolTable.insertar(ctx.ID().getSymbol(),tipo,false,ctx);
            else {
                if (ident instanceof TablaSimbolos.MethodIdent)
                    this.symbolTable.insertar(ctx.ID().getSymbol(),tipo,false,ctx);
                else
                    reportError("Variable name already defined!", ctx.ID().getSymbol());
            }
        }else
            reportError("Undefined type!",type);
        return null;
    }

    @Override
    public Object visitMethodSingleDeclaration(AlphaCompilerParser.MethodSingleDeclarationContext ctx) {
        int tipo=-1;
        Token type=null;
        if(ctx.VOID()==null) {
            type = (Token) visit(ctx.typeDenoter());
            tipo = verifyType(type.getText());
        }
        else
            tipo=4;

        if (tipo!=-1){
            LinkedList<Integer> params=null;
            if(ctx.paramList()!=null)
                params = (LinkedList<Integer>) visit(ctx.paramList());
            else
                params = new LinkedList<>();

            TablaSimbolos.Ident ident = this.symbolTable.buscarNivelActual(ctx.ID().getText());
            if(ident==null)
                this.symbolTable.insertar(ctx.ID().getSymbol(),tipo,params,ctx);
            else {
                if (ident instanceof TablaSimbolos.VarIdent)
                    this.symbolTable.insertar(ctx.ID().getSymbol(),tipo,params,ctx);
                else
                    reportError("Method name already defined!", ctx.ID().getSymbol());
            }
        }else
            reportError("Undefined type!",type);
        visit(ctx.singleCommand()); //chequear posibles errores en el cuerpo del método
        return null;
    }

    @Override
    public Object visitParamList(AlphaCompilerParser.ParamListContext ctx) {
        LinkedList<Integer> paramList = new LinkedList<>();
        for(AlphaCompilerParser.ParamContext p : ctx.param())
            paramList.add((int)visit(p));
        return paramList;
    }

    @Override
    public Object visitParam(AlphaCompilerParser.ParamContext ctx) {
        Token t = (Token)visit(ctx.typeDenoter());
        int type = verifyType(t.getText());
        if (type == -1)
            reportError("Undefined type!",t);
        return type;
    }

    @Override
    public Object visitTypeDenoter(AlphaCompilerParser.TypeDenoterContext ctx) {
        return ctx.ID().getSymbol();
    }

    @Override
    public Object visitExpression(AlphaCompilerParser.ExpressionContext ctx) {
        int returnType=-1;
        returnType = (int) visit(ctx.primaryExpression(0));
        for (int i = 1; i < ctx.primaryExpression().size(); i++) {
            Token op = (Token) visit(ctx.operator(i-1));
            int type2 = (int) visit(ctx.primaryExpression(i));
            returnType=compatibleTypes(op,returnType,type2);
            if (returnType==-1){
                reportError("Incompatible types!!!",op);//todo: cambiar al otro reportError
                throw new TypeCheckerException();
            }
        }
        return returnType;
    }

    private int compatibleTypes(Token op, int t1, int t2){
        int returnType = -1;
        switch (op.getType()){
            case(AlphaCompilerLexer.ADD):{
                if((t1==0)&&(t2==0))
                    returnType=0;
                else if ((t1==3)&&(t2==3))
                    returnType=3;
                break;
            }
            case(AlphaCompilerLexer.SUB):{
                if((t1==0)&&(t2==0))
                    returnType=0;
                break;
            }
            case(AlphaCompilerLexer.MUL):{
                if((t1==0)&&(t2==0))
                    returnType=0;
                break;
            }
            case(AlphaCompilerLexer.DIV):{
                if((t1==0)&&(t2==0))
                    returnType=0;
                break;
            }
            case(AlphaCompilerLexer.MOD):{
                if((t1==0)&&(t2==0))
                    returnType=0;
                break;
            }
            case(AlphaCompilerLexer.EQEQ):{
                if((t1==0)&&(t2==0))
                    returnType=2;
                else if ((t1==1)&&(t2==1))
                    returnType=2;
                else if ((t1==2)&&(t2==2))
                    returnType=2;
                else if ((t1==3)&&(t2==3))
                    returnType=2;
                break;
            }
            case(AlphaCompilerLexer.NOTEQ):{
                if((t1==0)&&(t2==0))
                    returnType=2;
                else if ((t1==1)&&(t2==1))
                    returnType=2;
                else if ((t1==2)&&(t2==2))
                    returnType=2;
                else if ((t1==3)&&(t2==3))
                    returnType=2;
                break;
            }
            case(AlphaCompilerLexer.LESS):{
                if((t1==0)&&(t2==0))
                    returnType=2;
                break;
            }
            case(AlphaCompilerLexer.MORET):{
                if((t1==0)&&(t2==0))
                    returnType=2;
                break;
            }
            case(AlphaCompilerLexer.LESSEQ):{
                if((t1==0)&&(t2==0))
                    returnType=2;
                break;
            }
            case(AlphaCompilerLexer.MOREEQ):{
                if((t1==0)&&(t2==0))
                    returnType=2;
                break;
            }
        }
        return returnType;
    }

    @Override
    public Object visitNumPrimaryExpression(AlphaCompilerParser.NumPrimaryExpressionContext ctx) {
        return 0;
    }

    @Override
    public Object visitIdPrimaryExpression(AlphaCompilerParser.IdPrimaryExpressionContext ctx) {
        //todo: verificar si el tipo de la expresión es entero en el caso de que SUB no sea null
        int returnType=-1;
        TablaSimbolos.Ident ident = this.symbolTable.buscar(ctx.ID().getText());
        if (ident != null){
            if (!(ident instanceof TablaSimbolos.MethodIdent)){
                returnType= ident.type;
            }else
                reportError("Not a variable/constant identifier!!!",ctx.ID().getSymbol());
        }else {
            reportError("Undefined identifier!!!", ctx.ID().getSymbol());
            throw new TypeCheckerException();
        }

        return returnType;
    }

    @Override
    public Object visitGroupPrimaryExpression(AlphaCompilerParser.GroupPrimaryExpressionContext ctx) {
        ///todo: verificar si el tipo de la expresión es entero en el caso de que SUB no sea null
        return visit(ctx.expression());
    }

    @Override
    public Object visitMethodCallPrimaryExpression(AlphaCompilerParser.MethodCallPrimaryExpressionContext ctx) {
        //todo: lo mismo que el otro methodCall pero este retorna el tipo de la expresión
        return super.visitMethodCallPrimaryExpression(ctx);
    }

    @Override
    public Object visitCharPrimaryExpression(AlphaCompilerParser.CharPrimaryExpressionContext ctx) {
        return 1;
    }

    @Override
    public Object visitStringPrimaryExpression(AlphaCompilerParser.StringPrimaryExpressionContext ctx) {
        return 3;
    }

    @Override
    public Object visitTruePrimaryExpression(AlphaCompilerParser.TruePrimaryExpressionContext ctx) {
        return 2;
    }

    @Override
    public Object visitFalsePrimaryExpression(AlphaCompilerParser.FalsePrimaryExpressionContext ctx) {
        return 2;
    }

    @Override
    public Object visitOperator(AlphaCompilerParser.OperatorContext ctx) {
        if(ctx.ADD()!=null)
            return ctx.ADD().getSymbol();
        else if(ctx.SUB()!=null)
            return ctx.SUB().getSymbol();
        else if(ctx.MUL()!=null)
            return ctx.MUL().getSymbol();
        else if(ctx.DIV()!=null)
            return ctx.DIV().getSymbol();
        else if(ctx.MOD()!=null)
            return ctx.MOD().getSymbol();
        else if(ctx.EQEQ()!=null)
            return ctx.EQEQ().getSymbol();
        else if(ctx.NOTEQ()!=null)
            return ctx.NOTEQ().getSymbol();
        else if(ctx.LESS()!=null)
            return ctx.LESS().getSymbol();
        else if(ctx.MORET()!=null)
            return ctx.MORET().getSymbol();
        else if(ctx.LESSEQ()!=null)
            return ctx.LESSEQ().getSymbol();
        else if(ctx.MOREEQ()!=null)
            return ctx.MOREEQ().getSymbol();
        else
            return null;
    }
}
