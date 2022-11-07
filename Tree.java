public class Tree<Type extends Comparable> {
    private Node<Type> root;
    public Tree() {
        this.root = null;
    }

    public void add(Type value) {
        Node<Type> element = new Node<Type>(value);
        if (this.root == null) root = element;
        else {
            Node<Type> current = this.root;
            while (true) {
                switch (element.getValue().compareTo(current.getValue()))    {
                    case -1:
                        if (current.getLeft_child() == null) current.setLeft_child(element);
                        else current = current.getLeft_child();
                        break;
                    case 1:
                        if (current.getRight_child() == null) current.setRight_child(element);
                        else current = current.getRight_child();
                        break;
                }
            }
        }
    }

    public void in_order(Node<Type> current) {
        if (current != null) {
            in_order(current.getLeft_child());
        }
    }

    public void pos_order(Node<Type> current){

    }
    
    public int height() {

    }
}
