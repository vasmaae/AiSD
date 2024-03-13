package Task1;

public class WorkList {
    WorkNode head;
    WorkNode tail;

    public void append(Work work) {
        WorkNode newNode = new WorkNode(work);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }

    public boolean remove(Work work) {
        WorkNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.getWork().equals(work)) {
                if (currentNode.getPrev() != null) {
                    currentNode.getPrev().setNext(currentNode.getNext());
                } else {
                    head = currentNode.getNext();
                }
                if (currentNode.getNext() != null) {
                    currentNode.getNext().setPrev(currentNode.getPrev());
                } else {
                    tail = currentNode.getPrev();
                }
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

class WorkNode {
    private Work work;
    private WorkNode next;
    private WorkNode prev;

    public WorkNode(Work work) {
        this.work = work;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public WorkNode getNext() {
        return next;
    }

    public void setNext(WorkNode next) {
        this.next = next;
    }

    public WorkNode getPrev() {
        return prev;
    }

    public void setPrev(WorkNode prev) {
        this.prev = prev;
    }
}