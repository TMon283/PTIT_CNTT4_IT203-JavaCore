package hn_k24_cntt4_HoangThaiMinh_005.bai2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        if (input == null) {
            System.out.println("Chuỗi không hợp lệ");
            return;
        }
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
            String normalize = type.toUpperCase();
            String key;
            if (normalize.equals("FOOD")) {
                key = "food";
            } else if (normalize.equals("TECH")) {
                key = "tech";
            } else if (normalize.equals("CLOTH")) {
                key = "cloth";
            } else {
                continue;
            }
            counter.put(key, counter.getOrDefault(key, 0) + 1);
        }
        if (counter.isEmpty()) {
            System.out.println("Không có sản phẩm hợp lệ");
        } else {
            System.out.println("Kết quả thống kê: ");
            counter.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                    forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
        }
        System.out.print("Bạn muốn tra cứu danh mục nào: ");
        String category = sc.nextLine();
        if (category == null) {
            System.out.println("Input trống. Vui lòng nhập lại");
            return;
        } else {
            System.out.print("Search "+category+": "+counter.get(category));
        }
    }
}
