package AST;

public class BlockSCASTree extends SingleCommandASTree {

    public CommandASTree command;

    public BlockSCASTree(){
    }

    public CommandASTree getCommand() {
        return command;
    }

    public void setCommand(CommandASTree command) {
        this.command = command;
    }
}
