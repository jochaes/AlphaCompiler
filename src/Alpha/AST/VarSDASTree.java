package Alpha.AST;

import org.antlr.v4.runtime.Token;

public class VarSDASTree extends SingleDeclarationASTree{

    private Token idToken;
    private TypeDenoterASTree typeDenoter;

    public VarSDASTree( Token pIdToken, TypeDenoterASTree pTypeDenoter ){
        this.idToken = pIdToken;
        this.typeDenoter = pTypeDenoter;
    }

}
