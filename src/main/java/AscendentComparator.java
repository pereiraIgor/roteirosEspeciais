import java.util.Comparator;

import adt.linkedList.SingleLinkedListImpl;
import adt.linkedList.SingleLinkedListNode;
import adt.linkedList.ordered.OrderedLinkedList;
import adt.linkedList.ordered.OrderedSingleLinkedListImpl;

public class AscendentComparator<T extends Comparable<T>> implements Comparator<SingleLinkedListNode<T extends Comparable<T>>> {

	@Override
	public int compare(SingleLinkedListNode<T> o1, SingleLinkedListNode<T> o2) {
		return o1.getData() - o2.getData() ;
		

	}

}
