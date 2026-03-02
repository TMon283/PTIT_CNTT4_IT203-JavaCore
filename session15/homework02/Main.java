package session15.homework02;

public class Main {
    public static void main(String[] args) {
        PatientQueue pq = new PatientQueue();
        pq.addPatient(new Patient("BN001", "Nguyễn Văn A", 30));
        pq.addPatient(new Patient("BN002", "Trần Thị B", 25));
        pq.addPatient(new Patient("BN003", "Lê Văn C", 40));

        pq.displayQueue();
        System.out.println("Bệnh nhân tiếp theo: " + pq.peekNextPatient());
        pq.callNextPatient();
        pq.displayQueue();
    }
}
