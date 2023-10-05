package Alpha.AST;

import org.antlr.v4.runtime.Token;

import java.util.LinkedList;

public class CallSCASTree extends SingleCommandASTree{

    private Token idToken;
    private Token pizqToken;

    private Token pderToken;
    private ExpressionASTree expression;
    private LinkedList<ExpressionASTree> expressionList;

    public CallSCASTree(){

    }


    public Token getIdToken() {
        return idToken;
    }

    public void setIdToken(Token idToken) {
        this.idToken = idToken;
    }

    public Token getPizqToken() {
        return pizqToken;
    }

    public void setPizqToken(Token pizqToken) {
        this.pizqToken = pizqToken;
    }

    public Token getPderToken() {
        return pderToken;
    }

    public void setPderToken(Token pderToken) {
        this.pderToken = pderToken;
    }

    public ExpressionASTree getExpression() {
        return expression;
    }

    public void setExpression(ExpressionASTree expression) {
        this.expression = expression;
    }

    public LinkedList<ExpressionASTree> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(LinkedList<ExpressionASTree> expressionList) {
        this.expressionList = expressionList;
    }
}
