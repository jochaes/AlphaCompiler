package Alpha.AST;

import org.antlr.v4.runtime.Token;

public class PrimaryExpressionASTree {

    private Token primaryExpressiontoken;
    private ExpressionASTree expression;

    public PrimaryExpressionASTree() {
    }

    public PrimaryExpressionASTree(Token primaryExpressiontoken, ExpressionASTree expression) {
        this.primaryExpressiontoken = primaryExpressiontoken;
        this.expression = expression;
    }
}
