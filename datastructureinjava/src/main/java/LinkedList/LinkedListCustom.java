package LinkedList;

/**
 * Created by sekou_diarra on 24/05/17.
 */
public class LinkedListCustom<T extends Comparable<T>> implements ListCustom<T> {

    private Node<T> root;
    private int sizeOfList;

    @Override
    public void insert(T data) {
        ++this.sizeOfList;

        if (root == null) {
            this.root = new Node<>(data);
        } else {
            insertDataAtBeginnig(data);
        }
    }

    //o(1)
    private void insertDataAtBeginnig(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    private void insertDataAtend(T data, Node<T> node) {
        if (node.getNextNode() != null) {
            insertDataAtend(data, node.getNextNode());
        } else {
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        if (this.root == null) return;
        -- this.sizeOfList;
    }

    @Override
    public void traverselist() {

    }

    @Override
    public int size() {
        return 0;
    }
}
