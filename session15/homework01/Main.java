package session15.homework01;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory recordHistory = new MedicalRecordHistory();

        recordHistory.addEdit(new EditAction("Cập nhật thông tin bệnh nhân", "02/03/2026 10:00"));
        recordHistory.addEdit(new EditAction("Thêm kết quả xét nghiệm máu", "02/03/2026 10:15"));
        recordHistory.addEdit(new EditAction("Chỉnh sửa đơn thuốc", "02/03/2026 10:30"));

        recordHistory.displayHistory();

        System.out.println("Chỉnh sửa gần nhất: " + recordHistory.getLatestEdit());

        recordHistory.undoEdit();

        recordHistory.displayHistory();
    }
}

