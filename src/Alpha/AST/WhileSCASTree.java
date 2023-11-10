package Alpha.AST;

public class WhileSCASTree extends SingleCommandASTree {

    private ExpressionASTree expression;
    private SingleCommandASTree singleCommand;

    public WhileSCASTree() {

    }

    public ExpressionASTree getExpression() {
        return expression;
    }

    public void setExpression(ExpressionASTree expression) {
        this.expression = expression;
    }

    @Override
    public SingleCommandASTree getSingleCommand() {
        return singleCommand;
    }

    @Override
    public void setSingleCommand(SingleCommandASTree singleCommand) {
        this.singleCommand = singleCommand;
    }
}
