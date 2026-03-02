package session16.miniProject;

import java.util.Stack;

public class ActivityLog<T> {
    private final Stack<T> stack = new Stack<>();

    public void push(T action) {
        if (action != null) {
            stack.push(action);
        }
    }

    public T peek() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.peek();
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public Stack<T> getAll() {
        Stack<T> clone = new Stack<>();
        clone.addAll(stack);
        return clone;
    }
}

