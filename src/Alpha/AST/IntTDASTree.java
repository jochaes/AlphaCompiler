package Alpha.AST;

import org.antlr.v4.runtime.Token;

public class IntTDASTree extends TypeDenoterASTree{

    private Token integerToken;

    public IntTDASTree(Token pIntegerToken){
        this.integerToken = pIntegerToken;
    }

}
