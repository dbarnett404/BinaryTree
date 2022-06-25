public class Node
{
    private Object element;
    private Node left;
    private Node right;
    private Node parent;

    public Node(Object element) {
        this.element = element;
        left = null;
        right = null;
        parent = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object newData) {
        element = newData;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node newLeft) {
        left = newLeft;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node newRight) {
        right = newRight;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node newParent) {
        parent = newParent;
    }

}