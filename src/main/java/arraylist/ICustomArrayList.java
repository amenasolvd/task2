package arraylist;

import java.util.Iterator;

public interface ICustomArrayList<E> extends Iterator {

    boolean isEmpty();
    int size();
    boolean add(E element);
    void remove(E element);
    Object get(int index);
    int indexOf(E element);
    void set(int index, E element);
    boolean contains(E element);
    E[] toArray();
}