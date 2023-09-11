package AST;

import org.antlr.v4.runtime.Token;

public class ConstSDASTree extends SingleDeclarationASTree {
    private ExpressionASTree expression;
    private Token idToken;

    public ConstSDASTree(ExpressionASTree pExpression, Token pIdToken) {
        this.expression = pExpression;
        this.idToken = pIdToken;
    }

    public ExpressionASTree getExpression() {
        return expression;
    }

    public void setExpression(ExpressionASTree expression) {
        this.expression = expression;
    }
}
