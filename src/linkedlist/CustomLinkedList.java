package linkedlist;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class CustomLinkedList<T> implements ICustomLinkedList<T> {

    private Node<T> head;
    private int length = 0;

    public CustomLinkedList() {
    }

    int getLength() {
        return this.length;
    }

    boolean isEmpty() {
        // Checking if next node points to null
        if (head == null) {
            return true;
        }
        return false;
    }

    public void add(Node node, T data) {
        Node<T> newNode = new Node<>(data);
        if (this.head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
    }

    public void remove(T data) {
        if (head == null) {
            return;
        }
        if (head.getData().equals(data)) {
            head = head.getNextNode();
            return;
        }
        Node<T> current = head;
        while (current.getNextNode() != null && ! current.getNextNode().getData().equals(data)) {
            current = current.getNextNode();
        }
        if (current.getNextNode() != null) {
            current.next = current.next.next;
        }
    }

    public List<T> getAll() {
        List<T> newList = new ArrayList<>();
        Node<T> current = head;
        while (current != null) {
            newList.add(current.getData);
            current = current.getNextNode();
        }
        return newList;
    }
}