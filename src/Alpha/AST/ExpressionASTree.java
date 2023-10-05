package Alpha.AST;

import org.antlr.v4.runtime.Token;

import java.util.LinkedList;

public class ExpressionASTree {

    PrimaryExpressionASTree primaryExpression;
    LinkedList<Token> operators;
    LinkedList<PrimaryExpressionASTree> primaryExpressionList;

    public ExpressionASTree() {
    }

    public ExpressionASTree(PrimaryExpressionASTree primaryExpression, LinkedList<Token> operators, LinkedList<PrimaryExpressionASTree> primaryExpressionList) {
        this.primaryExpression = primaryExpression;
        this.operators = operators;
        this.primaryExpressionList = primaryExpressionList;
    }

    public PrimaryExpressionASTree getPrimaryExpression() {
        return primaryExpression;
    }

    public void setPrimaryExpression(PrimaryExpressionASTree primaryExpression) {
        this.primaryExpression = primaryExpression;
    }

    public LinkedList<Token> getOperators() {
        return operators;
    }

    public void setOperators(LinkedList<Token> operators) {
        this.operators = operators;
    }

    public LinkedList<PrimaryExpressionASTree> getPrimaryExpressionList() {
        return primaryExpressionList;
    }

    public void setPrimaryExpressionList(LinkedList<PrimaryExpressionASTree> primaryExpressionList) {
        this.primaryExpressionList = primaryExpressionList;
    }
}
