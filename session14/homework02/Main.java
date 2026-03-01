package session14.homework02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("M01", "Paracetamol");
        map.put("M02", "Paradol");
        map.put("M03", "Ibuprofen");
        map.put("M04", "Aspirin");
        map.put("M05", "Codein");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thuốc: ");
        String medID = sc.nextLine();

        if (!map.containsKey(medID)) {
            System.out.println("Thuốc không tồn tại");
        } else {
            System.out.println("Tên thuốc: "+ map.get(medID));
        }
    }
}
