package Task1;

public class WorkStack implements Stackable {
    private WorkNode top;

    public WorkStack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Object work) {
        WorkNode newWorkNode = new WorkNode((Work)work);

        if (isEmpty()) {
            top = newWorkNode;
        } else {
            newWorkNode.setNext(top);
            top.setPrev(newWorkNode);
            top = newWorkNode;
        }
    }

    public Work pop() {
        if (isEmpty()) {
            return null;
        }

        Work work = top.getWork();
        top = top.getNext();
        if (top!= null) {
            top.setPrev(null);
        }

        return work;
    }

    public Work peek() {
        if (isEmpty()) {
            return null;
        }

        return top.getWork();
    }

    @Override
    public String toString() {
        WorkNode x = top;
        String s = "";

        if (x == null) {
            return "";
        }

        while (x != null) {
            s += x.getWork().toString();
            s += "\n";
            x = x.getNext();
        }

        return s;
    }
}

class WorkNode {
    private Work work;
    private WorkNode prev;
    private WorkNode next;

    public WorkNode getNext() {
        return next;
    }

    public Work getWork() {
        return work;
    }

    public void setNext(WorkNode next) {
        this.next = next;
    }

    public void setPrev(WorkNode prev) {
        this.prev = prev;
    }

    public WorkNode(Work work) {
        this.work = work;
    }
}