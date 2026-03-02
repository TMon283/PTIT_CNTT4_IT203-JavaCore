package session15.homework03;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack = new Stack<>();

    public boolean checkProcess(String[] actions) {
        for (String action : actions) {
            if (action.equals("PUSH")) {
                stack.push("Thuốc");
                System.out.println("Thao tác: PUSH → phát thuốc");
            } else if (action.equals("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Lỗi: Không thể POP khi Stack rỗng.");
                    return false;
                } else {
                    stack.pop();
                    System.out.println("Thao tác: POP → hoàn tất phát thuốc");
                }
            } else {
                System.out.println("Lỗi: Thao tác không hợp lệ - " + action);
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Lỗi: Kết thúc ca trực nhưng vẫn còn thuốc chưa phát hết.");
            return false;
        }

        System.out.println("Quy trình hợp lệ.");
        return true;
    }

    public void reset() {
        stack.clear();
        System.out.println("Đã reset quy trình.");
    }
}
