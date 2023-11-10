package Alpha.AST;

import org.antlr.v4.runtime.Token;

public class AssignSCASTree extends SingleCommandASTree {

    private Token idToken;
    private Token assignToken;

    private ExpressionASTree expression;

    public AssignSCASTree(){

    }
    public AssignSCASTree(Token idToken, Token assignToken, ExpressionASTree expression) {
        this.idToken = idToken;
        this.assignToken = assignToken;
        this.expression = expression;
    }

    public Token getIdToken() {
        return idToken;
    }

    public void setIdToken(Token idToken) {
        this.idToken = idToken;
    }

    public Token getAssignToken() {
        return assignToken;
    }

    public void setAssignToken(Token assignToken) {
        this.assignToken = assignToken;
    }

    public ExpressionASTree getExpression() {
        return expression;
    }

    public void setExpression(ExpressionASTree expression) {
        this.expression = expression;
    }
}
