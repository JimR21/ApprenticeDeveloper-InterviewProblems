package StringsAndArrays.Problem2;

import StringsAndArrays.Problem2.SingleLinkedList.Node;

/**
 * Find the nth element from the end of a single-linked list.
 */
public class Problem2 {

    public static Node findByIteration(Node first, int n) {
        Node iterator1 = first;
        Node iterator2 = first;
        for(int i = 0; i < n; i++) {
            iterator1 = iterator1.getNext();
        }
        while (iterator1.hasNext()) {
            iterator1 = iterator1.getNext();
            iterator2 = iterator2.getNext();
        }
        return iterator2;
    }

    public static int findByRecursion(Node node, int n, int counter) {
    	int result;
	    if (node != null && node.hasNext()) {
		    result = findByRecursion(node.getNext(), n, counter + 1);
	    }
	    else {
		    return n == 0 ? counter : -counter;
	    }
	    if (result < 0 && result + counter == -n)
		    return counter;
	    return result;
    }
}
