public class Node<Type> {
    private Type value;
    private Node<Type> left_child;
    private Node<Type> right_child;

    public Node(Type value) {
        this.value = value;
        this.left_child = null;
        this.right_child = null;
    }

    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
    }

    public Node<Type> getLeft_child() {
        return left_child;
    }

    public void setLeft_child(Node<Type> left_child) {
        this.left_child = left_child;
    }

    public Node<Type> getRight_child() {
        return right_child;
    }

    public void setRight_child(Node<Type> right_child) {
        this.right_child = right_child;
    }
}
