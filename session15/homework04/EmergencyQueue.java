package session15.homework04;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {
    private Queue<EmergencyPatient> emergencyQueue = new LinkedList<>();
    private Queue<EmergencyPatient> normalQueue = new LinkedList<>();

    public void addPatient(EmergencyPatient p) {
        if (p.getPriority() == 1) {
            emergencyQueue.add(p);
            System.out.println("Đã thêm bệnh nhân cấp cứu: " + p);
        } else {
            normalQueue.add(p);
            System.out.println("Đã thêm bệnh nhân thường: " + p);
        }
    }

    public EmergencyPatient callNextPatient() {
        if (!emergencyQueue.isEmpty()) {
            EmergencyPatient next = emergencyQueue.poll();
            System.out.println("Gọi bệnh nhân cấp cứu: " + next);
            return next;
        } else if (!normalQueue.isEmpty()) {
            EmergencyPatient next = normalQueue.poll();
            System.out.println("Gọi bệnh nhân thường: " + next);
            return next;
        } else {
            System.out.println("Không có bệnh nhân nào trong hàng đợi.");
            return null;
        }
    }

    public void displayQueue() {
        System.out.println("Danh sách bệnh nhân cấp cứu:");
        if (emergencyQueue.isEmpty()) {
            System.out.println("  (trống)");
        } else {
            for (EmergencyPatient p : emergencyQueue) {
                System.out.println("  " + p);
            }
        }

        System.out.println("Danh sách bệnh nhân thường:");
        if (normalQueue.isEmpty()) {
            System.out.println("  (trống)");
        } else {
            for (EmergencyPatient p : normalQueue) {
                System.out.println("  " + p);
            }
        }
    }
}
