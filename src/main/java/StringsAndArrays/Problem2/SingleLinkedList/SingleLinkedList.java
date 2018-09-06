package StringsAndArrays.Problem2.SingleLinkedList;

public class SingleLinkedList {
    Node first;

    public SingleLinkedList() {
        first = new Node();
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        Node node = first;
        while (node.hasNext()) {
            node = node.getNext();
        }
        return node;
    }

	/**
	 * Returns the nth node from the list.
	 * @param n The number of the node in the list. Starts from 0.
	 * @return The nth node of the list.
	 * @throws IndexOutOfBoundsException
	 */
	public Node get(int n) throws IndexOutOfBoundsException {
	    Node node = first;
	    for (int i = 0; i < n; i++) {
		    if (node.hasNext()) {
			    node = node.getNext();
		    } else {
			    throw new IndexOutOfBoundsException();
		    }
	    }
	    return node;
    }

    public int getSize() {
	    Node node = first;
	    int i = 0;
	    if (node != null) {
		    while (node.hasNext()) {
			    node = node.getNext();
			    i++;
		    }
	    }
	    return i;
    }

    public void add(String str) {
        if(first.getData() != null){
            Node node = new Node(str);
            getLast().setNext(node);
        } else {
            first.setData(str);
        }
    }
}
