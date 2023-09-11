package AST;

import org.antlr.v4.runtime.Token;

import java.util.LinkedList;

public class DefSDAST extends SingleDeclarationASTree{
    private Token functionName;
    private Token argumentName;
    private TypeDenoterASTree argumentType;

    private LinkedList<Token> args;
    private LinkedList<TypeDenoterASTree> argsTypes;

    private CommandASTree functionBody;

    public DefSDAST(){}

    public Token getFunctionName() {
        return functionName;
    }

    public void setFunctionName(Token functionName) {
        this.functionName = functionName;
    }

    public Token getArgumentName() {
        return argumentName;
    }

    public void setArgumentName(Token argumentName) {
        this.argumentName = argumentName;
    }

    public TypeDenoterASTree getArgumentType() {
        return argumentType;
    }

    public void setArgumentType(TypeDenoterASTree argumentType) {
        this.argumentType = argumentType;
    }

    public LinkedList<Token> getArgs() {
        return args;
    }

    public void setArgs(LinkedList<Token> args) {
        this.args = args;
    }

    public LinkedList<TypeDenoterASTree> getArgsTypes() {
        return argsTypes;
    }

    public void setArgsTypes(LinkedList<TypeDenoterASTree> argsTypes) {
        this.argsTypes = argsTypes;
    }

    public CommandASTree getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(CommandASTree functionBody) {
        this.functionBody = functionBody;
    }
}
