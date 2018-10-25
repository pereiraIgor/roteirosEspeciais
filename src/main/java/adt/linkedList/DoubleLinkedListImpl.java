package adt.linkedList;

public class DoubleLinkedListImpl<T> extends SingleLinkedListImpl<T> implements DoubleLinkedList<T> {

	public DoubleLinkedListImpl() {
		head = new DoubleLinkedListNode<>();
		last = (DoubleLinkedListNode<T>) head;
	}

	protected DoubleLinkedListNode<T> last;

	@Override
	public void insert(T element) {
		DoubleLinkedListNode<T> newLast = new DoubleLinkedListNode<T>(element, new DoubleLinkedListNode<>(), last);
		((DoubleLinkedListNode<T>) newLast.next).setPrevious(newLast);
		last.setNext(newLast);
		if (last.isNIL()) {
			head = newLast;
		}
		last = newLast;
	}

	@Override
	public void remove(T element) {
		DoubleLinkedListNode<T> auxNode = (DoubleLinkedListNode<T>) head;
		if (head.getData().equals(element)) {
			head.setData(null);
			((DoubleLinkedListNode<T>) head).previous = null;
			head = head.next;

		} else {
			while (!auxNode.isNIL() && !auxNode.getData().equals(element)) {
				auxNode = (DoubleLinkedListNode<T>) auxNode.next;
			}
			if (!auxNode.isNIL() && auxNode.getData().equals(element)) {
				auxNode.previous.setNext(auxNode.next);
				((DoubleLinkedListNode<T>) auxNode.next).setPrevious(auxNode.previous);
			}

		}

	}

	@Override
	public void insertFirst(T element) {
		DoubleLinkedListNode<T> nil = new DoubleLinkedListNode<>();
		DoubleLinkedListNode<T> newHead = new DoubleLinkedListNode<>(element, (DoubleLinkedListNode<T>) head, nil);
		newHead.previous.next = newHead;
		((DoubleLinkedListNode<T>) head).previous = newHead;

		if (head.isNIL()) {
			last = newHead;
		}

		head = newHead;
	}

	@Override
	public void removeFirst() {
		head.data = null;
		((DoubleLinkedListNode<T>) head).previous = null;
		if (head.next.isNIL()) {
			head.next = null;
		} else {
			head = head.next;
		}
	}

	@Override
	public void removeLast() {
		last.data = null;
		last.next = null;
		if (last.previous.isNIL()) {
			last.previous = null;
		} else {
			last = last.previous;
		}
	}

	public DoubleLinkedListNode<T> getLast() {
		return last;
	}

	public void setLast(DoubleLinkedListNode<T> last) {
		this.last = last;
	}

}
