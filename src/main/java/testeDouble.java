import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import adt.linkedList.DoubleLinkedListImpl;
import adt.linkedList.DoubleLinkedListNode;

public class testeDouble {

	private DoubleLinkedListImpl<Integer> teste = new DoubleLinkedListImpl<>();

	@Test
	public void testInsert() {
		teste.insert(new Integer(1));
		teste.insert(2);
		teste.insert(3);
	}

	@Test
	public void testRemove() {
		teste.insert(1);
		teste.insert(2);
		teste.insert(3);
		teste.insert(4);
		teste.remove(4);
		teste.remove(1);
		
	}

	@Test
	public void testInsertFirst() {
		teste.insertFirst(1);
		teste.insertFirst(2);
		teste.insert(3);
		teste.remove(3);
		
	}

	@Test
	public void testRemoveFirst() {
		teste.insert(1);
		teste.insert(2);
		teste.removeFirst();
		teste.removeFirst();
	
	}

	@Test
	public void testRemoveLast() {
		teste.insert(1);
		teste.insert(2);
		teste.removeLast();
		System.out.println(Arrays.toString(teste.toArray()));
	}

}
