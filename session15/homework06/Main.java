package session15.homework06;

public class Main {
    public static void main(String[] args) {
        PatientWaitingQueue pwq = new PatientWaitingQueue();
        pwq.addPatient(new Patient("BN001", "Nguyễn Văn A", 30, "Nam"));
        pwq.addPatient(new Patient("BN002", "Trần Thị B", 25, "Nữ"));
        pwq.displayQueue();
        System.out.println("Gọi bệnh nhân: " + pwq.callNextPatient());

        MedicalRecordHistory mrh = new MedicalRecordHistory("HS001");
        mrh.addEdit(new EditAction("Cập nhật địa chỉ", "Bác sĩ C", "02/03/2026 10:00"));
        mrh.addEdit(new EditAction("Thêm kết quả xét nghiệm", "Bác sĩ D", "02/03/2026 10:15"));
        mrh.displayHistory();
        System.out.println("Hoàn tác: " + mrh.undoEdit());

        TicketSystem ts = new TicketSystem();
        ts.issueTicket("02/03/2026 09:00");
        ts.issueTicket("02/03/2026 09:05");
        ts.displayTickets();
        System.out.println("Gọi số: " + ts.callNextTicket());

        UndoManager um = new UndoManager(3);
        um.addAction(new InputAction("Địa chỉ", "Hà Nội", "Hải Phòng", "02/03/2026 09:30"));
        um.addAction(new InputAction("Số điện thoại", "0123456789", "0987654321", "02/03/2026 09:35"));
        um.displayUndoStack();
        System.out.println("Hoàn tác: " + um.undo());
    }
}
