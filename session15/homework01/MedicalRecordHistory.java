package session15.homework01;

import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> history = new Stack<>();

    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Đã thêm chỉnh sửa: " + action);
    }

    public EditAction undoEdit() {
        if (!history.isEmpty()) {
            EditAction undone = history.pop();
            System.out.println("Hoàn tác chỉnh sửa: " + undone);
            return undone;
        } else {
            System.out.println("Không có chỉnh sửa nào để hoàn tác.");
            return null;
        }
    }

    public EditAction getLatestEdit() {
        if (!history.isEmpty()) {
            return history.peek();
        } else {
            System.out.println("Không có chỉnh sửa nào.");
            return null;
        }
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Lịch sử chỉnh sửa trống.");
        } else {
            System.out.println("Danh sách chỉnh sửa hiện có:");
            for (EditAction action : history) {
                System.out.println(action);
            }
        }
    }
}

