package session15.homework03;

public class Main {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        // Ví dụ 1: Quy trình hợp lệ
        String[] actions1 = {"PUSH", "PUSH", "POP", "POP"};
        System.out.println("Kiểm tra quy trình 1:");
        checker.checkProcess(actions1);

        checker.reset();

        // Ví dụ 2: Quy trình không hợp lệ (pop khi rỗng)
        String[] actions2 = {"POP", "PUSH"};
        System.out.println("\nKiểm tra quy trình 2:");
        checker.checkProcess(actions2);

        checker.reset();

        // Ví dụ 3: Quy trình không hợp lệ (còn thuốc chưa phát hết)
        String[] actions3 = {"PUSH", "PUSH", "POP"};
        System.out.println("\nKiểm tra quy trình 3:");
        checker.checkProcess(actions3);
    }
}
