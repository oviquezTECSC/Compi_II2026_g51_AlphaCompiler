package typechecker;

import org.antlr.v4.runtime.*;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class TablaSimbolos {
    LinkedList<Ident> tabla;

    private int nivelActual;

    public int getNivelActual() {
        return nivelActual;
    }

    abstract class Ident{
        Token tok;
        int type; //esto probablemente cambie a un tipo más estructurado
        int nivel;

        ParserRuleContext decl;

        public Ident(Token t, int tp, ParserRuleContext d){
            tok = t;
            type = tp;
            this.nivel=nivelActual;
            this.decl = d;
        }
        public Ident(Token t, int nivel, int tp, ParserRuleContext d){
            tok = t;
            type = tp;
            this.nivel=nivel;
            this.decl = d;
        }

    }

    public class VarIdent extends Ident{
        boolean isConstant;
        public VarIdent(Token t, int tp, boolean ic, ParserRuleContext d){
            super(t,tp,d);
            isConstant = ic;
        }

        public VarIdent(Token t, int tp, int nivel, boolean ic, ParserRuleContext d){
            super(t,nivel,tp,d);
            isConstant = ic;
        }
    }

    public class MethodIdent extends Ident{
        LinkedList<Integer> params;
        public MethodIdent(Token t, int tp, LinkedList<Integer> p, ParserRuleContext d){
            super(t,tp,d);
            this.params = p;
        }
    }

    public TablaSimbolos() {
        tabla = new LinkedList<Ident>();
        this.nivelActual=-1;
    }

    public void insertar(Token id, int tipo, boolean isConstant, ParserRuleContext d)
    {
        Ident i = new VarIdent(id,tipo,isConstant,d);
        tabla.addFirst(i);
    }

    public void insertar(Token id, int tipo,int nivel, ParserRuleContext d)
    {
        Ident i = new VarIdent(id,tipo, nivel,false,d);
        tabla.addFirst(i);
    }

    public void insertar(Token id, int tipo, LinkedList<Integer> p, ParserRuleContext d)
    {
        Ident i = new MethodIdent(id,tipo,p,d);
        tabla.addFirst(i);
    }

    public Ident buscar(String nombre)
    {
        Ident temp=null;
        for(Ident id : tabla)
            if (id.tok.getText().equals(nombre)) {
                temp = id;
                break;
            }
        return temp;
    }

    public Ident buscarNivelActual(String nombre)
    {
        Ident temp=null;
        int tempNivel=nivelActual;
        for(Object id : tabla)
            if (tempNivel == ((Ident)id).nivel) {
                if (((Ident) id).tok.getText().equals(nombre))
                    temp = ((Ident) id);
            }
            else
                break;
        return temp;
    }

    public void openScope(){
        nivelActual++;
    }

    public void closeScope(){
        tabla = tabla.stream().filter(ident -> ident.nivel != this.nivelActual).collect(Collectors.toCollection(LinkedList::new));
        nivelActual--;
    }

    public void closeScopeArgs(){
        int nivelTemp = this.nivelActual+1;
        tabla = tabla.stream().filter(ident -> ident.nivel != nivelTemp).collect(Collectors.toCollection(LinkedList::new));
    }

    public void imprimir() {
        System.out.println("----- INICIO TABLA ------");
        for (int i = 0; i < tabla.size(); i++) {
            Token s = (Token) tabla.get(i).tok;
            System.out.println("Nombre: " + s.getText() + " - " + ((Ident) tabla.get(i)).nivel + " - " + ((Ident) tabla.get(i)).type);
/*            if (s.getType() == 0) System.out.println("\tTipo: Indefinido");
            else if (s.getType() == 1) System.out.println("\tTipo: Integer\n");
            else if (s.getType() == 2) System.out.println("\tTipo: String\n");*/
        }
        System.out.println("----- FIN TABLA ------");
    }
}
