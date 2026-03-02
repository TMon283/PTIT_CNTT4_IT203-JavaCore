package session15.homework05;

import java.util.Stack;

public class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps = new Stack<>();

    public EmergencyCase(Patient patient) {
        this.patient = patient;
    }

    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Thêm bước xử lý cho " + patient.getName() + ": " + step);
    }

    public TreatmentStep undoStep() {
        if (!steps.isEmpty()) {
            TreatmentStep undone = steps.pop();
            System.out.println("Hoàn tác bước xử lý: " + undone);
            return undone;
        } else {
            System.out.println("Không có bước xử lý nào để hoàn tác.");
            return null;
        }
    }

    public void displaySteps() {
        System.out.println("Các bước xử lý cho bệnh nhân " + patient.getName() + ":");
        if (steps.isEmpty()) {
            System.out.println("  (chưa có bước xử lý)");
        } else {
            for (TreatmentStep step : steps) {
                System.out.println("  " + step);
            }
        }
    }

    public Patient getPatient() {
        return patient;
    }
}

