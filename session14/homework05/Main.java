package session14.homework05;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Patient> patientComparator = (p1, p2) -> {
            if (p1.getSeverity() != p2.getSeverity()) {
                return Integer.compare(p1.getSeverity(), p2.getSeverity());
            } else {
                return Integer.compare(p1.getArrivalTime(), p2.getArrivalTime());
            }
        };

        TreeSet<Patient> queue = new TreeSet<>(patientComparator);

        queue.add(new Patient("Bệnh nhân A", 3, 800)); // 8:00
        queue.add(new Patient("Bệnh nhân B", 1, 815)); // 8:15
        queue.add(new Patient("Bệnh nhân C", 1, 805)); // 8:05
        queue.add(new Patient("Bệnh nhân D", 2, 810)); // 8:10

        System.out.println("Thứ tự xử lý:");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}
