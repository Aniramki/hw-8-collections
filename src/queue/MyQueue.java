package queue;

import linkedlist.java.Node;

import java.util.Queue;

public class MyQueue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int count;

    {
        head = null;
        tail = null;
        count = 0;
    }


    public void add(T value) {

        if (head == null && tail == null) {
            Node<T> node = new Node<>();

            node.setValue(value);

            head = node;
            tail = node;
        } else {
            Node<T> node = new Node<>();
            node.setValue(value);

            tail.setNext(node);
            tail = node;
        }
        count++;

    }



    public T remove(int index) {
        if (index < 0 || index > count - 1 || count == 0) {
            throw new IndexOutOfBoundsException();
        }

        int i = 0;
        Node<T> node = head;

        if (index == 0) {
            Node<T> next = node.getNext();
            if (next != null) {
                head = next;
                count--;

            } else {
                head = null;
            }
            return node.getValue();
        }

        while (node != null) {
            if (i + 1 == index) {
                Node<T> next = node.getNext();
                node.setNext(next.getNext());
                count--;

                return next.getValue();
            }
            i++;
            node = node.getNext();
        }
        return null;
    }

    public void clear() throws NullPointerException {
        head = null;
        tail = null;
        count = 0;
    }

    public int size() {
        return count;
    }

    public T peek() {
        if (head == null) {
            return null;
        }

        return head.getValue();

    }

    public T poll() {
        if (head == null) {
            return null;
        }
        Node<T> node = head;
        Node<T> next = node.getNext();
        if (next != null) {
            head = next;
            count--;
        } else {
            head = null;
            count = 0;
        }
        return node.getValue();
    }


}
