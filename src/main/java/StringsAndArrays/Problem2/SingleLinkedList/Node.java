package StringsAndArrays.Problem2.SingleLinkedList;

public class Node {
    String data;
    Node next;

    public Node() {
        data = null;
        next = null;
    }

    public Node(String data) {
        this.data = data;
        next = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }
}
