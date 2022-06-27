public class Main {
    public static void main(String[] args) throws Exception {
        BinaryTree binaryTree = new BinaryTree();
        Node rootNode = binaryTree.addRoot("/");
        //Add the layer below the root
        binaryTree.insertLeft(rootNode,"*");
        binaryTree.insertRight(rootNode,"+");

        //Add the elements to the node at the left of root
        binaryTree.insertLeft(rootNode.getLeft(), "+");
        binaryTree.insertRight(rootNode.getLeft(), "-");

        //Add the elements to the node at the right of root
        binaryTree.insertLeft(rootNode.getRight(), "e");
        binaryTree.insertRight(rootNode.getRight(), "f");

        //Add the elements to root left left
        binaryTree.insertLeft(rootNode.getLeft().getLeft(), "a");
        binaryTree.insertRight(rootNode.getLeft().getLeft(), "b");

        //Add the elements to root left right
        binaryTree.insertLeft(rootNode.getLeft().getRight(), "c");
        binaryTree.insertRight(rootNode.getLeft().getRight(), "d");

        System.out.println("Pre-order: " + BinaryTreeTraversal.preOrder(rootNode));
        System.out.println("Iterative Pre-order: " + BinaryTreeTraversal.iterativePreOrder(rootNode));
        System.out.println("In-order: " + BinaryTreeTraversal.inOrder(rootNode));
        System.out.println("Iterative In-order: " + BinaryTreeTraversal.iterativeInOrder(rootNode));
        System.out.println("Post-order: " + BinaryTreeTraversal.postOrder(rootNode));
        System.out.println("Iterative Post-order: " + BinaryTreeTraversal.iterativePostOrder(rootNode));
        System.out.println("Height " + binaryTree.getBTHeight(rootNode));
    }
}
