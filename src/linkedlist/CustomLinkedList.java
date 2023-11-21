package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class CustomLinkedList<T> implements ICustomLinkedList<T>{

    public Node<T> head;
    private int length = 0;

    public CustomLinkedList(){
        this.head = null;
    }

    int length() { return this.length; }

    boolean empty()
    {

        // Checking if next node points to null
        if (head == null) {
            return true;
        }
        return false;
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(T data) {
        if (head == null) {
            return;
        }
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }
        Node<T> current = head  ;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public List<T> getAll() {
        List<T> newList = new ArrayList<>();
        Node<T> current = head;
        while (current != null) {
            newList.add(current.data);
            current = current.next;
        }
        return newList;
    }
}