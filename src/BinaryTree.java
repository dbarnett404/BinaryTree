import java.util.NoSuchElementException;


/**
 * Class BinaryTree provides a linked structure representation of the binary tree ADT. A binary tree 
 * consists of a (possibly empty) collection of Node objects related by parent, left-child and
 * right-child. Each Node also has a data element. The implementation provides basic operations
 * for woring with binary trees as well as a sample method for preorder traversal
 */
public class BinaryTree
{
    // a tree has a root node (as a field)
    private Node root;

    // a tree also records the size in another field
    private int size;

    /**
     * Basic Constructor for objects of class BinaryTree
     */
    public BinaryTree() {
        root = null;
        size = 0;
    }

    /**
     * Return the root node (or throw exception for empty tree).
     */
    public Node root() {
        if (root == null ) {
            System.out.println("Empty tree");
        }
        return root;
    }

    /**
     * Check whether a node is a leaf of not.
     * @param n the node to check
     * @return true if the node is a leaf; false otherwise
     */
    public boolean isLeaf(Node node) {
        return (node.getLeft() == null && node.getRight() == null);
    }

    /**
     * Check whether a node is the root of the tree
     * @param node the node to check
     * @return true if the node is the root; false otherwise
     */
    public boolean isRoot(Node node) {
        return node == root();
    }

    /**
     * Check whether the tree is empty
     * @return true if the tree is empty (has no nodes); false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Check that a node has a left child
     * @param node the node to be checked
     * @return true if the left child exists; false otherwise
     */
    public boolean hasLeft(Node node) {
        return node.getLeft() != null;
    }

    /**
     * Check that a node has a right child
     * @param node the node to be checked
     * @return true if the right child exists; false otherwise
     */
    public boolean hasRight(Node node) {
        return node.getRight() != null;
    }

    /**
     * Get the parent of a given node (or throw an exception if the given node is the root)
     * @param node the given node
     * @return a tree node 
     */
    public Node getParent(Node node) {
        if (isRoot(node))
            System.out.println("Root of tree");
        return node.getParent();
    }

    /**
     * Construct a new node with the given data and make this the root of the tree. An error occurs
     * if the tree already has a node.
     * @param element the data element of the new node
     * @return the new node created
     */
    public Node addRoot(Object element) throws Exception {
        if (!isEmpty()) {
            throw new Exception("tree already has a root");
        }
        root = new Node(element);
        size = 1;
        return root;
    }

    /**
     * Construct a new node with the given data and add it has the left child of the specified node. 
     * An error condition occurs in the specified node already has a left child.
     * @param node the node specified
     * @param element the data element of the new left child node
     * @return the new left child node
     */
    public Node insertLeft(Node node, Object element) throws Exception {
        if (node.getLeft()!=null) {
            throw new Exception("node already has left");
        }
        Node newLeft = new Node(element);
        node.setLeft(newLeft);
        size++;
        return newLeft;
    }

    /**
     * Construct a new node with the given data and add it has the right child of the specified node. 
     * An error condition occurs in the specified node already has a right child.
     * @param node the node specified
     * @param data the data element of the new right child node
     * @return the new right child node
     */
    public Node insertRight(Node node, Object element) throws Exception {
        if (node.getRight()!=null) {
            throw new Exception("node already has right");
        }
        Node newRight = new Node(element);
        node.setRight(newRight);
        size++;
        return newRight;
    }
    public int getBTHeight(Node node) {
        if (node == null)
            return 0;
        int leftBTHeight = getBTHeight(node.getLeft());
        int rightBTHeight = getBTHeight(node.getRight());
        return Math.max(leftBTHeight, rightBTHeight) + 1;
    }

}