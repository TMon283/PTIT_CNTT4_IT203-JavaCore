package session15.homework05;

public class Main {
    public static void main(String[] args) {
        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        Patient p1 = new Patient("BN001", "Nguyễn Văn A", 45);
        Patient p2 = new Patient("BN002", "Trần Thị B", 30);

        EmergencyCase case1 = new EmergencyCase(p1);
        EmergencyCase case2 = new EmergencyCase(p2);

        queue.addCase(case1);
        queue.addCase(case2);

        EmergencyCase currentCase = queue.getNextCase();

        currentCase.addStep(new TreatmentStep("Tiếp nhận bệnh nhân", "02/03/2026 22:50"));
        currentCase.addStep(new TreatmentStep("Chẩn đoán ban đầu", "02/03/2026 22:55"));
        currentCase.addStep(new TreatmentStep("Điều trị khẩn cấp", "02/03/2026 23:00"));

        currentCase.displaySteps();
        currentCase.undoStep();
        currentCase.displaySteps();
    }
}
