package typechecker;

import org.antlr.v4.runtime.Token;
import syntaxchecker.generated.AlphaCompilerBaseVisitor;
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
        int exprType = (int) visit(ctx.expression());
        TablaSimbolos.Ident ident = this.symbolTable.buscar(ctx.ID().getText());
        if (ident != null){
            if (!(ident instanceof TablaSimbolos.MethodIdent)){
                if (((TablaSimbolos.VarIdent)ident).isConstant == false){
                    if (ident.type!=exprType)
                        reportError("Incompatible types in assign!",ctx.ID().getSymbol());
                        //todo: hacer un método polimórfico para reportError que incluya tipos incompatibles
                }else
                    reportError("Cannot assign to constant definition!!!",ctx.ID().getSymbol());
            }else
                reportError("Cannot assign to method definition!!!",ctx.ID().getSymbol());
        }else
            reportError("Undefined identifier!!!",ctx.ID().getSymbol());
        return null;
    }

    @Override
    public Object visitMethodCallSingleCommand(AlphaCompilerParser.MethodCallSingleCommandContext ctx) {
        return super.visitMethodCallSingleCommand(ctx);
    }

    @Override
    public Object visitReturnSingleCommand(AlphaCompilerParser.ReturnSingleCommandContext ctx) {
        return super.visitReturnSingleCommand(ctx);
    }

    @Override
    public Object visitIfSingleCommand(AlphaCompilerParser.IfSingleCommandContext ctx) {
        return super.visitIfSingleCommand(ctx);
    }

    @Override
    public Object visitWhileSingleCommand(AlphaCompilerParser.WhileSingleCommandContext ctx) {
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
        return super.visitMethodSingleDeclaration(ctx);
    }

    @Override
    public Object visitParamList(AlphaCompilerParser.ParamListContext ctx) {
        return super.visitParamList(ctx);
    }

    @Override
    public Object visitParam(AlphaCompilerParser.ParamContext ctx) {
        return super.visitParam(ctx);
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
            visit(ctx.operator(i-1));
            visit(ctx.primaryExpression(i));
        }
        return returnType;
    }

    @Override
    public Object visitNumPrimaryExpression(AlphaCompilerParser.NumPrimaryExpressionContext ctx) {
        return 0;
    }

    @Override
    public Object visitIdPrimaryExpression(AlphaCompilerParser.IdPrimaryExpressionContext ctx) {
        return super.visitIdPrimaryExpression(ctx);
    }

    @Override
    public Object visitGroupPrimaryExpression(AlphaCompilerParser.GroupPrimaryExpressionContext ctx) {
        return super.visitGroupPrimaryExpression(ctx);
    }

    @Override
    public Object visitMethodCallPrimaryExpression(AlphaCompilerParser.MethodCallPrimaryExpressionContext ctx) {
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
        return super.visitOperator(ctx);
    }
}
