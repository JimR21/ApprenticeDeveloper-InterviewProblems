package StringsAndArrays.Problem2;

import StringsAndArrays.Problem2.SingleLinkedList.Node;
import StringsAndArrays.Problem2.SingleLinkedList.SingleLinkedList;
import junit.framework.TestCase;
import org.junit.Test;

public class Problem2Tests extends TestCase{
    SingleLinkedList list;

    public void setUp() {
	    list = new SingleLinkedList();
	    for (Integer i = 1; i <= 10; i++) {
		    list.add(i.toString());
	    }
    }

	@Test
    public void testIterator() {
    	int n = 3;
        Node nthFromLast = Problem2.findByIteration(list.getFirst(), n);
	    assertEquals(list.get(list.getSize() - n).getData(), nthFromLast.getData());
    }

	@Test
	public void testIteratorFirst() {
		Node firstFromLast = Problem2.findByIteration(list.getFirst(), 0);
		assertEquals(list.get(list.getSize()).getData(), firstFromLast.getData());
	}

	@Test
	public void testIteratorLast() {
		Node lastFromLast = Problem2.findByIteration(list.getFirst(), list.getSize());
		assertEquals(list.getFirst().getData(), lastFromLast.getData());
	}

	@Test
	public void testRecursion() {
    	int n = 3;
		int nthFromLast = Problem2.findByRecursion(list.getFirst(), n, 0);
		assertEquals(list.get(list.getSize() - n).getData(), list.get(nthFromLast).getData());
	}

	@Test
	public void testRecursionFirst() {
		int nthFromLast = Problem2.findByRecursion(list.getFirst(), 0, 0);
		assertEquals(list.get(list.getSize()).getData(), list.get(nthFromLast).getData());
	}

	@Test
	public void testRecursionLast() {
		int nthFromLast = Problem2.findByRecursion(list.getFirst(), list.getSize(), 0);
		assertEquals(list.getFirst().getData(), list.get(nthFromLast).getData());
	}

}
