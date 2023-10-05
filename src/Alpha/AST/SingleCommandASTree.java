package Alpha.AST;

public class SingleCommandASTree {

    SingleCommandASTree singleCommand;

    public SingleCommandASTree(){

    }
    public SingleCommandASTree(SingleCommandASTree singleCommand) {
        this.singleCommand = singleCommand;
    }

    public SingleCommandASTree getSingleCommand() {
        return singleCommand;
    }

    public void setSingleCommand(SingleCommandASTree singleCommand) {
        this.singleCommand = singleCommand;
    }
}
