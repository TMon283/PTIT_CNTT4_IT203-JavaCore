package session15.homework06;

import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> editStack = new Stack<>();
    private String recordId;

    public MedicalRecordHistory(String recordId) {
        this.recordId = recordId;
    }

    public void addEdit(EditAction action) {
        editStack.push(action);
        System.out.println("Thêm chỉnh sửa: " + action);
    }

    public EditAction undoEdit() {
        if (!editStack.isEmpty()) {
            return editStack.pop();
        }
        return null;
    }

    public void displayHistory() {
        System.out.println("Lịch sử chỉnh sửa bệnh án " + recordId + ":");
        for (EditAction e : editStack) {
            System.out.println(e);
        }
    }
}

