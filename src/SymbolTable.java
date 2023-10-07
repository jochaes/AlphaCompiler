import generatedMiniPython.MiniPythonParser;
import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.LinkedList;

public class SymbolTable {
    LinkedList<Ident> table;

    public int currentLevel;

    public abstract class Ident{
        Token token;
        int type;
        int level;

        ParserRuleContext declarationContext;

        public Ident(Token t, int tp, ParserRuleContext decl){
            token = t;
            type = tp;
            level = currentLevel;
            declarationContext = decl;
        }
    }

    public class VarIdent extends Ident{
        public VarIdent(Token t, int tp, ParserRuleContext decl){
            super (t,tp,decl);
        }
    }

    public class MethodIdent extends Ident{
        MiniPythonParser.ArgListContext params;  //Los parametros están en el ArgList

        public MethodIdent(Token t, int tp, MiniPythonParser.ArgListContext p, ParserRuleContext decl){
            super(t,tp,decl);
            this.params = p;
        }

    }

    public SymbolTable(){
        table = new LinkedList<Ident>();
        this.currentLevel = -1;
    }

    public void insert( Token id, int type, MiniPythonParser.ArgListContext p, ParserRuleContext decl  ){

        //TODO No se puede insertar un elemento repetido en el mismo nivel
        Ident i = new MethodIdent(id, type, p, decl);
        table.addFirst(i);

    }

    public void insert(Token id, int type, ParserRuleContext decl){
        //TODO No se puede insertar un elmento repetido en el mismo nivel
        Ident i = new VarIdent(id, type, decl);
        table.addFirst(i);
    }

    public Ident find(String name){
        Ident temp = null;

        for(Object id: table){
            if ( ((Ident)id).token.getText().equals(name) ){
                return ((Ident)id);
            }
        }
        return temp;
    }

    public void openScope(){currentLevel++;}

    public void closeScope(){
        table.removeIf( n -> (((Ident)n).level == currentLevel) );
        currentLevel--;
    }

    public void print(){
        System.out.println("---- Inicio de Tabla ----");
        for (int i  = 0; i < table.size(); i++ ){
            Token s = (Token) ((Ident) table.get(i)).token;
            System.out.println("Nombre: " + s.getText() + " - " + ((Ident) table.get(i)).level + " - " + ((Ident) table.get(i)).type );
        }
        System.out.println("---- Fin Tabla ----");
    }






}
