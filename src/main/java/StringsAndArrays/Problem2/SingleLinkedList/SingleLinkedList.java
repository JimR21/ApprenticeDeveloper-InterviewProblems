package StringsAndArrays.Problem2.SingleLinkedList;

/**
 * Simple signle linked list
 */
public class SingleLinkedList {
    Node first;

	/**
	 * Default constructor
	 */
	public SingleLinkedList() {
        first = new Node();
    }

	/**
	 * Return the first node of the list
	 * @return The first node
	 */
	public Node getFirst() {
        return first;
    }

	/**
	 * Return the last node of the list
	 * @return The last node of the list
	 */
	public Node getLast() {
        Node node = first;
        while (node.hasNext()) {
            node = node.getNext();
        }
        return node;
    }

	/**
	 * Returns the nth node from the list
	 * @param n The number of the node in the list. Starts from 0
	 * @return The nth node of the list
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

	/**
	 * Returns the size of the list
	 * @return the size of the list
	 */
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

	/**
	 * Add a new node in the list containing the String data passed
	 * @param str The data of the new node
	 */
	public void add(String str) {
        if(first.getData() != null){
            Node node = new Node(str);
            getLast().setNext(node);
        } else {
            first.setData(str);
        }
    }
}
