package Task1;

import java.util.ArrayList;
import java.util.List;

public class WorkStack {
    private List<Work> stack;

    public WorkStack() {
        this.stack = new ArrayList<>();
    }

    public void push(Work work) {
        stack.add(work);
    }

    public Work pop() {
        if (!stack.isEmpty()){
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
