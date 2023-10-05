package Alpha.AST;

import org.antlr.v4.runtime.Token;

public class CharTDASTree extends TypeDenoterASTree{

    private Token charToken;

    public CharTDASTree(Token pCharToken){
        this.charToken = pCharToken;
    }
}
