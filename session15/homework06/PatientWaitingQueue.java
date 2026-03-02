package session15.homework06;

import java.util.LinkedList;
import java.util.Queue;

public class PatientWaitingQueue {
    private Queue<Patient> waitingQueue = new LinkedList<>();
    private int totalPatients = 0;

    public void addPatient(Patient p) {
        waitingQueue.add(p);
        totalPatients++;
        System.out.println("Thêm bệnh nhân: " + p);
    }

    public Patient callNextPatient() {
        if (!waitingQueue.isEmpty()) {
            totalPatients--;
            return waitingQueue.poll();
        }
        return null;
    }

    public void displayQueue() {
        System.out.println("Danh sách bệnh nhân chờ khám:");
        for (Patient p : waitingQueue) {
            System.out.println(p);
        }
    }
}
