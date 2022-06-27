import java.util.Stack;

public class BinaryTreeTraversal {
    /**
     * Perform a preorder traversal of the tree rooted at node n. Return a String representing
     * the data elements of each node in the order they are visited.
     * @param node the node from which the traversal starts.
     * @return a String representation of the data elements of the nodes visited in preorder
     */
    /*public static String preOrder(Node node) {
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
    }*/
    public static String preOrder(Node node) {
        String nodes = "";
        //Base case
        if (node == null)
            return "";
        nodes += " " + node.getElement();
        nodes += preOrder(node.getLeft());
        nodes += preOrder(node.getRight());
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
    public static String inOrder(Node node) {
        String nodes ="";
        if (node != null) {
            nodes += inOrder(node.getLeft());
            nodes += " " + node.getElement();
            nodes += inOrder(node.getRight());
        }
        return nodes;
    }

    // An iterative process to print preorder traversal of Binary tree
    public static String iterativePreOrder(Node root)
    {
        String nodes ="";
        // Base Case
        if (root == null) {
            return nodes;
        }

        // Create an empty stack and push root to it
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
        while (stack.empty() == false) {

            // Pop the top item from stack and print it
            Node node = stack.peek();
            nodes += " " + node.getElement();

            stack.pop();

            // Push right and left children of the popped node to stack
            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
        return nodes;
    }
    public static String iterativeInOrder(Node root)
    {
        String nodes ="";
        if (root == null)
            return nodes;

        Stack<Node> s = new Stack<>();
        Node node = root;

        // traverse the tree
        while (node != null || s.size() > 0)
        {
            // Reach the left most Node of the node
            while (node !=  null)
            {
                s.push(node);
                node = node.getLeft();
            }

            node = s.pop();
            nodes += " " + node.getElement();

            node = node.getRight();
        }
        return nodes;
    }

    public static String iterativePostOrder(Node root)
    {
        String nodes ="";
        if (root == null)
            return nodes;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node prev = null;
        while (!stack.isEmpty()) {
            Node node = stack.peek();
            if (prev == null || prev.getLeft() == node || prev.getRight() == node) {
                if (node.getLeft() != null)
                    stack.push(node.getLeft());
                else if (node.getRight() != null)
                    stack.push(node.getRight());
                else {
                    stack.pop();
                    nodes += " " + node.getElement();
                }
            }
            else if (node.getLeft() == prev) {
                if (node.getRight() != null)
                    stack.push(node.getRight());
                else {
                    stack.pop();
                    nodes += " " + node.getElement();
                }
            }
            else if (node.getRight() == prev) {
                stack.pop();
                nodes += " " + node.getElement();
            }
            prev = node;
        }
        return nodes;
    }
}
