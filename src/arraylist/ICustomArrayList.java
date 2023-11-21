package arrayList;

import java.util.Iterator;

public interface ICustomList<E> extends Iterator {
    boolean isEmpty();

    int size();

    boolean add(int index, E element);

    Object remove(int index);

    Object get(int index);

    int indexOf(E element);

    void set(int index, E element);

    boolean contains(E element);

    E[] toArray();


}