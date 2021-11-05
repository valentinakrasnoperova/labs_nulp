package lab2.task2;

import java.util.Iterator;

public class Stack implements Iterable<Node> {
    private Node top;
    private Node current;

    public Stack() {
        this.top = null;
    }

    public void push(int item) {
        Node node = new Node();// allocate memory in the heap

        // check if heap is full.
        if (node == null) {
            System.out.println("Heap Overflow");
            return;
        }
        System.out.println(item);

        // set data in the allocated node
        node.data = item;

        // point to the current top node of the list
        node.next = top;

        // update top pointer
        top = node;
    }

    public void pop() throws Exception {
        // check for stack underflow
        if (isEmpty()) {
            throw new Exception("Stack underflow");
        }

        System.out.println(peek());

        // update the top pointer to point to the next node
        top = top.next;
    }

    public int peek() throws Exception {
        // check for an empty stack
        if (isEmpty()) {
            throw new Exception("Stack underflow");
        } else {
            return top.data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    class MyIterator implements Iterator<Node> {
        public boolean hasNext() {
            if (current == null) {
                current = top;
            } else {
                current = current.getNext();
            }
            return (current != null);
        }

        public Node next() {
            return current;
        }
    }

    @Override
    public Iterator<Node> iterator() {
        return new MyIterator();
    }

}