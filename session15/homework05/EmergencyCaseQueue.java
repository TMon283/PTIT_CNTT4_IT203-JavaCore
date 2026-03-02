package session15.homework05;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases = new LinkedList<>();

    public void addCase(EmergencyCase c) {
        cases.add(c);
        System.out.println("Đã thêm ca cấp cứu cho bệnh nhân: " + c.getPatient().getName());
    }

    public EmergencyCase getNextCase() {
        if (!cases.isEmpty()) {
            EmergencyCase next = cases.poll();
            System.out.println("Xử lý ca cấp cứu của bệnh nhân: " + next.getPatient().getName());
            return next;
        } else {
            System.out.println("Không có ca cấp cứu nào trong hàng đợi.");
            return null;
        }
    }
}

