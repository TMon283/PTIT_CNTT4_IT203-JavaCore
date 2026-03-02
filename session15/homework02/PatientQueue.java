package session15.homework02;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue = new LinkedList<>();

    public void addPatient(Patient p) {
        queue.add(p);
        System.out.println("Đã thêm bệnh nhân: " + p);
    }

    public Patient callNextPatient() {
        if (!queue.isEmpty()) {
            Patient next = queue.poll();
            System.out.println("Gọi bệnh nhân: " + next);
            return next;
        } else {
            System.out.println("Không có bệnh nhân nào trong hàng đợi.");
            return null;
        }
    }

    public Patient peekNextPatient() {
        if (!queue.isEmpty()) {
            return queue.peek();
        } else {
            System.out.println("Không có bệnh nhân nào trong hàng đợi.");
            return null;
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Hàng đợi bệnh nhân trống.");
        } else {
            System.out.println("Danh sách bệnh nhân còn chờ:");
            for (Patient p : queue) {
                System.out.println(p);
            }
        }
    }
}

