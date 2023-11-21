package arraylist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayList<E> implements ICustomArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int current = 0;

    public CustomArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public CustomArrayList(int capacity) {
        elements = new Object[capacity];
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean add(E element) {
        ensureCapacity();
        elements[this.size] = element;
        return true;
    }

    private void checkRange(int index) {
        if (index < 0 || index >= (this.size + 1)) {
            throw new IllegalArgumentException("illegal index:" + index);
        }
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void remove(E element) {
        if (element == null) {
            for (int i = 0; i < this.size; i++) {
                if (this.elements[i] == null) {
                    fastRemove(i);
                }
            }
        } else {
            for (int i = 0; i < this.size; i++) {
                if (element.equals(this.elements[i])) {
                    fastRemove(i);
                }
            }
        }
    }

    private void fastRemove(int index) {
        int movedNumber = this.size - index - 1;
        if (movedNumber > 0) {
            System.arraycopy(this.elements, index + 1, this.elements, index, movedNumber);
        }
        this.elements[--this.size] = null;
    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }

    @Override
    public int indexOf(E element) {
        if (element == null) {
            for (int i = 0; i < this.elements.length; i++) {
                if (this.elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < this.elements.length; i++) {
                if (element.equals(this.elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public void set(int index, E element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        ensureCapacity();
        this.elements[index] = element;
    }

    @Override
    public boolean contains(E element) {
        if (element == null) {
            for (Object e : this.elements) {
                if (e == null) {
                    return true;
                }
            }
        } else {
            for (Object e : this.elements) {
                if (element.equals(e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Object[]> getAll() {
        List<Object[]> newList = new ArrayList<>();
        while(current != 0){
            newList.add(elements);
            current = current++;
        }
        return newList;
    }

    @Override
    public E[] toArray() {
        return (E[]) this.elements;
    }

    @Override
    public boolean hasNext() {
        return this.current < size();
    }

    @Override
    public Object next() {
        E value = (E) elements[current++];
        return value;
    }
}