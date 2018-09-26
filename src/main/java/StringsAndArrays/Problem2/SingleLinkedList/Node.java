package StringsAndArrays.Problem2.SingleLinkedList;

/**
 * Node class used in @{@link SingleLinkedList}
 */
public class Node {
    String data;
    Node next;

	/**
	 * Default constructor
	 */
	public Node() {
        data = null;
        next = null;
    }

	/**
	 * Constructor with initial data
	 * @param data the string passed as data of the Node
	 */
	public Node(String data) {
        this.data = data;
        next = null;
    }

	/**
	 * Returns the data of the Node
	 * @return the data of the node as a String
	 */
	public String getData() {
        return data;
    }

	/**
	 * Sets the String data of the Node
	 * @param data The String data of the Node
	 */
	public void setData(String data) {
        this.data = data;
    }

	/**
	 * Get the next Node
	 * @return The next Node
	 */
	public Node getNext() {
        return next;
    }

	/**
	 * Set the next Node
	 * @param next The next Node
	 */
	public void setNext(Node next) {
        this.next = next;
    }

	/**
	 * Returns true if the Node has a next Node, false otherwise
	 * @return True if the Node is not the last
	 */
	public boolean hasNext() {
        return next != null;
    }
}
