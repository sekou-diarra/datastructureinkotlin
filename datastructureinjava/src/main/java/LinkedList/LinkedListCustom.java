package LinkedList;

/**
 * Created by sekou_diarra on 24/05/17.
 */
public class LinkedListCustom<T extends Comparable<T>> implements ListCustom<T> {

    //dans les linkedList on es capable d'acceder au noeud racine
    private Node<T> root;
    private int sizeOfList;

    @Override
    public void insert(T data) {
        ++this.sizeOfList;

        if (root == null) {
            this.root = new Node<>(data);
        } else {
            insertDataAtBeginnig(data); // linkedList efficace pour insertion au de but de la liste
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
        --this.sizeOfList;
        if (this.root.getData().compareTo(data) == 0) {
            this.root = this.root.getNextNode();
        } else {
            remove(data, root, root.getNextNode());
        }
    }

    private void remove(T dataToRemove, Node<T> previousNode, Node<T> actualNode) {

        while (actualNode != null) {
            if (actualNode.getData().compareTo(dataToRemove) == 0) {
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public void traverselist() {
        if (this.root == null) return;
        Node<T> actualNode = this.root;
        while (actualNode != null) {
            System.out.print(actualNode + " -> ");
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.sizeOfList;

    }
}
