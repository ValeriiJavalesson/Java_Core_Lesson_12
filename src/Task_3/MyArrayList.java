package Task_3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class MyArrayList<T> implements List<T> {
	private static final int DEFAULT_SIZE = 10;
	private int size;
	private Object[] elements;

	@SuppressWarnings("static-access")
	MyArrayList() {
		elements = new Object[this.DEFAULT_SIZE];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean add(Object element) {
		resize();
		elements[size] = element;
		size++;
		return elements[size - 1] == element;
	}

	private void resize() {
		if (elements.length == size) {
			Object[] newElements = new Object[size * 2];
			System.arraycopy(elements, 0, newElements, 0, size);
			elements = newElements;
		}
	}

	@Override
	public void add(int index, Object element) {
		Objects.checkIndex(index, size + 1);
		resize();
		System.arraycopy(elements, index, elements, index + 1, size - index);
		elements[size] = element;
		size++;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) {
		Objects.checkIndex(index, size);
		T removedElement = (T) elements[index];
		System.arraycopy(elements, index+1, elements, index, size - index - 1);
		size--;
		return removedElement;
	}

	@Override
	public boolean remove(Object o) {
		for(int i = 0; i<size;i++) {
			if(elements[i].equals(o))remove(i);
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		Objects.checkIndex(index, size);
		return (T) elements[index];
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("hiding")
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
