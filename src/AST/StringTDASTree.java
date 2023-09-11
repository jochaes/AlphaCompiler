package AST;

import org.antlr.v4.runtime.Token;

public class StringTDASTree extends TypeDenoterASTree{
    private Token stringtoken;

    public StringTDASTree(Token pStringToken){
        this.stringtoken = pStringToken;

    }
}
