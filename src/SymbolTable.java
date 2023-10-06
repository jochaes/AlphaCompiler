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

//    public class MethodIdent extends Ident{
//
//    }


}
