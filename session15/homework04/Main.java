package session15.homework04;

public class Main {
    public static void main(String[] args) {
        EmergencyQueue eq = new EmergencyQueue();

        eq.addPatient(new EmergencyPatient("BN001", "Nguyễn Văn A", 2));
        eq.addPatient(new EmergencyPatient("BN002", "Trần Thị B", 1));
        eq.addPatient(new EmergencyPatient("BN003", "Lê Văn C", 2));
        eq.addPatient(new EmergencyPatient("BN004", "Phạm Thị D", 1));

        eq.displayQueue();
        eq.callNextPatient();
        eq.callNextPatient();
        eq.displayQueue();
    }
}

