package Alpha.AST;

import java.util.LinkedList;

public class DeclarationASTree {
    SingleDeclarationASTree singleDeclaration;
    LinkedList<SingleDeclarationASTree> singleDeclarationList;


    public DeclarationASTree(SingleDeclarationASTree singleDeclaration, LinkedList<SingleDeclarationASTree> singleDeclarationList) {
        this.singleDeclaration = singleDeclaration;
        this.singleDeclarationList = singleDeclarationList;
    }
}
