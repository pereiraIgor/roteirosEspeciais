import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.experimental.categories.IncludeCategories;

import adt.linkedList.SingleLinkedListImpl;

public class teste {
	private SingleLinkedListImpl<Integer> teste1 = new SingleLinkedListImpl<>();
	@Test
	public void testIsEmpty() {
		teste1.insert(1);
		assertFalse(teste1.isEmpty());
	}

	@Test
	public void testSize() {
		teste1.insert(1);
		teste1.insert(2);
		teste1.insert(3);
		teste1.insert(4);
		assertEquals(teste1.size(), 4);
	}

	@Test
	public void testSearch() {
		teste1.insert(1);
		teste1.insert(2);
		teste1.insert(3);
		teste1.insert(4);
		assertEquals(teste1.search(new Integer(1)), new Integer(1));
	}

	@Test
	public void testInsert() {
		teste1.insert(1);
		assertEquals(new Integer(1), teste1.search(1));
	}

	@Test
	public void testRemove() {
		teste1.insert(1);
		teste1.insert(2);
		teste1.insert(3);
		teste1.remove(1);
		assertEquals(teste1.size(), 2);
		teste1.remove(2);
	}

	@Test
	public void testToArray() {
		teste1.insert(1);
		teste1.insert(2);
		teste1.insert(4);
		System.out.println(Arrays.toString(teste1.toArray()));
	}

}
