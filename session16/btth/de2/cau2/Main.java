package session16.btth.de2.cau2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== He thong dieu phoi tin nhan ===");
        System.out.println("Nhap danh sach loai tin nhan (cach nhau boi dau phay), vi du: SMS, Email, SMS, Zalo:");
        String input = scanner.nextLine();

        Queue<String> queue = new LinkedList<>();
        String[] parts = input.split(",");
        for (String raw : parts) {
            String type = raw.trim();
            if (!type.isEmpty()) {
                queue.offer(type);
            }
        }

        Map<String, Integer> counter = new HashMap<>();

        while (!queue.isEmpty()) {
            String type = queue.poll();
            String normalized = type.toLowerCase();
            String key;
            if (normalized.equals("sms")) {
                key = "SMS";
            } else if (normalized.equals("email")) {
                key = "Email";
            } else if (normalized.equals("zalo")) {
                key = "Zalo";
            } else {
                continue;
            }
            counter.put(key, counter.getOrDefault(key, 0) + 1);
        }

        if (counter.isEmpty()) {
            System.out.println("Khong co tin nhan hop le nao duoc xu ly.");
        } else {
            System.out.println("Ket qua thong ke (giam dan theo so luong):");
            counter.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
        }

        scanner.close();
    }
}
