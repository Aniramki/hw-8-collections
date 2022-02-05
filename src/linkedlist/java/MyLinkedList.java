package linkedlist.java;

import java.util.HashMap;

public class MyLinkedList<T> {

    private Node<T> head;

    public void add(T item) {
        if (head == null) {
            Node<T> node = new Node<>();
            node.setValue(item);
            head = node;
        } else {
            Node<T> node = new Node<>();
            node.setValue(item);

            Node<T> last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(node);
        }

    }

    public int size() {
        if (head == null) {
            return 0;
        }
        int count = 1;
        Node<T> last = head;
        while (last.getNext() != null) {
            last = last.getNext();
            count++;
        }
        return count;
    }

    public T get(int index) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        Node<T> search = head;
        for (int i = 0; i < index; i++) {
            search = search.getNext();
        }
        if (search == null) {
            throw new IndexOutOfBoundsException("Invalid index:" + index + ", Size: " + size());
        }
        return search.getValue();
    }

    public T remove(int index) {
        if (index < 0 || index > size() || size() == 0) {
            throw new IndexOutOfBoundsException();
        }

        int i = 0;
        Node<T> node = head;

        if (index == 0) {
            Node<T> next = node.getNext();
            if (next != null) {
                head = next;
            } else {
                head = null;
            }
            return node.getValue();
        }

        while (node != null) {
            if (i + 1 == index) {
                Node<T> next = node.getNext();
                node.setNext(next.getNext());
                return next.getValue();
            }
            i++;
            node = node.getNext();
        }
        return null;
    }
    public void clear()  throws NullPointerException{
        head =null;
    }


    }


