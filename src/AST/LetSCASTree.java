package AST;

public class LetSCASTree extends SingleCommandASTree{

    private DeclarationASTree declaration;
    private SingleCommandASTree singleCommand;

    public LetSCASTree(){

    }

    public DeclarationASTree getDeclaration() {
        return declaration;
    }

    public void setDeclaration(DeclarationASTree declaration) {
        this.declaration = declaration;
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
