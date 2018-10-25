package adt.linkedList.ordered;

import java.util.Collections;
import java.util.Comparator;

import adt.linkedList.SingleLinkedListImpl;
import adt.linkedList.SingleLinkedListNode;

/**
 * Para testar essa classe voce deve implementar seu comparador. Primeiro
 * implemente todos os métodos requeridos. Depois implemente dois comparadores
 * (com idéias opostas) e teste sua classe com eles. Dependendo do comparador
 * que você utilizar a lista funcionar como ascendente ou descendente, mas a
 * implemntação dos métodos é a mesma.
 * 
 * @author Adalberto
 *
 * @param <T>
 */
public class OrderedSingleLinkedListImpl<T extends Comparable<T>> extends SingleLinkedListImpl<T>
		implements OrderedLinkedList<T> {

	private Comparator<T> comparator;

	public OrderedSingleLinkedListImpl(Comparator<T> comparator) {
		this.comparator = comparator;
	}

	@Override
	public void insert(T element) {
		SingleLinkedListNode<T> auxNode = head;

		while (!auxNode.isNIL() && comparator.compare(auxNode.getData(), element) > 0) {
			auxNode = auxNode.getNext();
		}
		if (!auxNode.isNIL()) {
			SingleLinkedListNode<T> newNewNode = new SingleLinkedListNode<>(element, auxNode.getNext());
			auxNode.setNext(newNewNode);
		}
	}

	@Override
	public T minimum() {
		return head.getData();
	}

	@Override
	public T maximum() {
		SingleLinkedListNode<T> auxHead = head;
		while (!auxHead.getNext().isNIL()) {
			auxHead = auxHead.getNext();
		}
		return auxHead.getData();
	}

	public Comparator<T> getComparator() {
		return comparator;
	}

	public void setComparator(Comparator<T> comparator) {
		this.comparator = comparator;
	}
}
