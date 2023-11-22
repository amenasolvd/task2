package linkedlist;

import java.util.List;

public interface ICustomLinkedList<T> {

    void add(CustomLinkedList list, T data);
    void remove(T data);
    List<T> getAll();
}