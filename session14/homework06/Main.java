package session14.homework06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Lan", 30, "Tim mạch"));
        patients.add(new Patient("Hùng", 45, "Nội tiết"));
        patients.add(new Patient("Mai", 25, "Tim mạch"));
        patients.add(new Patient("Tuấn", 50, "Nội tiết"));
        patients.add(new Patient("An", 40, "Thần kinh"));

        Map<String, List<Patient>> departmentMap = new HashMap<>();

        for (Patient p : patients) {
            departmentMap
                    .computeIfAbsent(p.getDepartment(), k -> new ArrayList<>())
                    .add(p);
        }

        System.out.println("Danh sách bệnh nhân theo khoa:");
        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            System.out.println("Khoa " + entry.getKey() + " -> " + entry.getValue());
        }

        String busiestDept = null;
        int maxCount = 0;
        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            if (entry.getValue().size() > maxCount) {
                maxCount = entry.getValue().size();
                busiestDept = entry.getKey();
            }
        }

        System.out.println("\nKhoa đông nhất: " + busiestDept + " (" + maxCount + " bệnh nhân)");
    }
}

