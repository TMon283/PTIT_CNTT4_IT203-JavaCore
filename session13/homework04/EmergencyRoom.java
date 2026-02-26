package session13.homework04;

import java.util.LinkedList;

public class EmergencyRoom {
    private LinkedList<String> patients = new LinkedList<>();

    public void patientCheckIn(String name) {
        patients.addLast(name);
        System.out.println("Check-in thường: " + name);
    }

    public void emergencyCheckIn(String name) {
        patients.addFirst(name);
        System.out.println("Check-in cấp cứu: " + name);
    }

    public void treatPatient() {
        if (patients.isEmpty()) {
            System.out.println("Không còn bệnh nhân trong danh sách.");
            return;
        }
        String current = patients.removeFirst();
        if (current.equals("C")) {
            System.out.println("Đang cấp cứu: " + current);
        } else {
            System.out.println("Đang khám: " + current);
        }
    }
}

