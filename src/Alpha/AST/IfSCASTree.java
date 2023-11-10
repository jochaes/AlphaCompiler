package Alpha.AST;

import org.antlr.v4.runtime.Token;

public class IfSCASTree extends SingleCommandASTree {
    private ExpressionASTree expression;
    private SingleCommandASTree singlecommand;
    private SingleCommandASTree elseSinglecommand;

    public IfSCASTree() {

    }

    public IfSCASTree(Token ifToken, Token thenToken, Token elseToken, ExpressionASTree expression, SingleCommandASTree singlecommand, SingleCommandASTree elseSinglecommand) {

        this.expression = expression;
        this.singlecommand = singlecommand;
        this.elseSinglecommand = elseSinglecommand;
    }

    public ExpressionASTree getExpression() {
        return expression;
    }

    public void setExpression(ExpressionASTree expression) {
        this.expression = expression;
    }

    public SingleCommandASTree getSinglecommand() {
        return singlecommand;
    }

    public void setSinglecommand(SingleCommandASTree singlecommand) {
        this.singlecommand = singlecommand;
    }

    public SingleCommandASTree getElseSinglecommand() {
        return elseSinglecommand;
    }

    public void setElseSinglecommand(SingleCommandASTree elseSinglecommand) {
        this.elseSinglecommand = elseSinglecommand;
    }
}
