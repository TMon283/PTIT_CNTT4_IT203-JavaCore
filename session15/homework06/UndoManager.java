package session15.homework06;

import java.util.Stack;

public class UndoManager {
    private Stack<InputAction> undoStack = new Stack<>();
    private int maxUndoSteps;

    public UndoManager(int maxUndoSteps) {
        this.maxUndoSteps = maxUndoSteps;
    }

    public void addAction(InputAction action) {
        if (undoStack.size() >= maxUndoSteps) {
            undoStack.remove(0); // bỏ bước cũ nhất
        }
        undoStack.push(action);
        System.out.println("Thêm thao tác nhập liệu: " + action);
    }

    public InputAction undo() {
        if (!undoStack.isEmpty()) {
            return undoStack.pop();
        }
        return null;
    }

    public void displayUndoStack() {
        System.out.println("Các thao tác có thể hoàn tác:");
        for (InputAction a : undoStack) {
            System.out.println(a);
        }
    }
}

