package Task1;

public class Stack implements Stackable {
    private Node top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Object data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top.setPrev(newNode);
            top = newNode;
        }
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }

        Object data = top.getData();
        top = top.getNext();
        if (top!= null) {
            top.setPrev(null);
        }

        return data;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }

        return top.getData();
    }

    @Override
    public String toString() {
        Node nodeToString = top;
        String stackToString = "";

        if (nodeToString == null) {
            return "";
        }

        while (nodeToString != null) {
            stackToString += nodeToString.getData().toString();
            stackToString += "\n";
            nodeToString = nodeToString.getNext();
        }

        return stackToString;
    }
}

class Node {
    private Object data;
    private Node prev;
    private Node next;

    public Node getNext() {
        return next;
    }

    public Object getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node(Object data) {
        this.data = data;
    }
}