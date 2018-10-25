package adt.linkedList;

public class SingleLinkedListImpl<T> implements LinkedList<T> {

	protected SingleLinkedListNode<T> head;

	public SingleLinkedListImpl() {
		this.head = new SingleLinkedListNode<T>();
	}

	@Override
	public boolean isEmpty() {
		return head.isNIL();
	}

	@Override
	public int size() {
		SingleLinkedListNode<T> auxHead = head;
		int tamanho = 0;
		while (!auxHead.isNIL()) {
			tamanho++;
			auxHead = auxHead.next;
		}
		return tamanho;
	}

	@Override
	public T search(T element) {
		SingleLinkedListNode<T> auxHead = head;
		T top = null;
		while (!auxHead.isNIL() && !auxHead.getData().equals(element)) {
			auxHead = auxHead.next;
		}
		if (!auxHead.isNIL() && auxHead.getData().equals(element)) {
			top = auxHead.getData();
		}
		return top;
	}

	@Override
	public void insert(T element) {
		SingleLinkedListNode<T> auxHead = head;
		if (head.isNIL()) {
			head.setData(element);
			SingleLinkedListNode<T> nil = new SingleLinkedListNode<>();
			head.setNext(nil);
		} else {

			while (!auxHead.isNIL()) {
				auxHead = auxHead.next;
			}
			SingleLinkedListNode<T> newNode = new SingleLinkedListNode<T>();
			auxHead.setData(element);
			auxHead.setNext(newNode);
		}
	}

	@Override
	public void remove(T element) {
		SingleLinkedListNode<T> auxHead = head;
		if(head.getData().equals(element)) {
			head = head.next;
		}else {

			while (!auxHead.isNIL() && !auxHead.getData().equals(element)) {
				auxHead = auxHead.next;
			}
			if(!auxHead.isNIL() && auxHead.getData().equals(element)) {
				auxHead.setData(auxHead.next.getData());
				auxHead.setNext(auxHead.next.next);
			}
		}
			
	}

	@Override
	public T[] toArray() {
		T[] array = (T[]) new Object[size()];
		int indice = 0;
		SingleLinkedListNode<T> newHead = head;
		while (!newHead.isNIL()) {
			array[indice++] = newHead.getData();
			newHead = newHead.getNext();
		}
		return array;
	}

	public SingleLinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(SingleLinkedListNode<T> head) {
		this.head = head;
	}

}
