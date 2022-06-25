public class BinaryTreeTraversal {
    /**
     * Perform a preorder traversal of the tree rooted at node n. Return a String representing
     * the data elements of each node in the order they are visited.
     * @param node the node from which the traversal starts.
     * @return a String representation of the data elements of the nodes visited in preorder
     */
    public static String preOrder(Node node) {
        String nodes = "";
        // if tree exists
        if (node != null) {
            // visit the node (root of subtree)
            nodes += " " + node.getElement();
            // pre-order traverse left subtree
            nodes += preOrder(node.getLeft());
            // pre-order traverse right subtree
            nodes += preOrder(node.getRight());
        }
        return nodes;
    }

    /**
     * Perform a postorder traversal of the tree rooted at node n. Return a String representing
     * the data elements of each node in the order they are visited.
     * @param node the node from which the traversal starts.
     * @return String representation of the data elements of the nodes visited in postorder.
     */
    public static String postOrder(Node node)
    {
        String nodes ="";
        if (node != null) {
            nodes += postOrder(node.getLeft());
            nodes += postOrder(node.getRight());
            nodes += " " + node.getElement();
        }
        return nodes;
    }

    /**
     * Perform an inorder traversal
     * @param node
     * @return String of the tree items
     */
    public static String inOrder(Node node)
    {
        String nodes ="";
        if (node != null) {
            nodes += inOrder(node.getLeft());
            nodes += " " + node.getElement();
            nodes += inOrder(node.getRight());
        }
        return nodes;
    }
}
