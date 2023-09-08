package AST;

import java.util.LinkedList;

public class CommandASTree {

    private SingleCommandASTree singleCommand;
    private LinkedList<SingleCommandASTree> singleCommandList;

    public CommandASTree(SingleCommandASTree singleCommand, LinkedList<SingleCommandASTree> singleCommandList) {
        this.singleCommand = singleCommand;
        this.singleCommandList = singleCommandList;
    }


}
