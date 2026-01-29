package session05.btth;

import java.util.Scanner;
import java.util.regex.*;

public class btth_SS05 {
    public static Scanner sc = new Scanner(System.in);
    public static Pattern msvPartern = Pattern.compile("^B\\d{7}$");

    public static void main(String[] args) {
        String[] arr = new String[100];
        int size = 0;

        while (true) {
            System.out.println("\n=== Quản lý MSSV ===");
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    display(arr, size);
                    break;
                case "2":
                    size = addNew(arr, size);
                    break;
                case "3":
                    updateByIndex(arr, size);
                    break;
                case "4":
                    size = deleteByMSSV(arr, size);
                    break;
                case "5":
                    break;
                case "0":
                    System.out.println("Kết thúc chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    public static int addNew(String[] arr, int size) {
        if (size >= arr.length) {
            System.out.println("Mảng đã đầy. Không thể thêm.");
            return size;
        }
        while (true) {
            System.out.print("Nhập MSSV mới (B + 7 chữ số): ");
            String input = sc.nextLine().trim();
            String normalized = input.toUpperCase();
            if (isValidMSSV(normalized)) {
                boolean exists = false;
                for (int i = 0; i < size; i++) {
                    if (arr[i].equalsIgnoreCase(normalized)) { exists = true; break; }
                }
                if (exists) {
                    System.out.println("MSSV đã tồn tại. Nhập MSSV khác.");
                    continue;
                }
                arr[size++] = normalized;
                System.out.println("Đã thêm: " + normalized);
                return size;
            } else {
                System.out.println("MSSV không hợp lệ. Định dạng: ^B\\d{7}$");
            }
        }
    }

    public static void updateByIndex(String[] arr, int size) {
        display(arr, size);
        System.out.print("Nhập index cần sửa (0.." + (size - 1) + "): ");
        String s = sc.nextLine().trim();
        try {
            int idx = Integer.parseInt(s);
            if (idx < 0 || idx >= size) {
                System.out.println("Index không hợp lệ.");
                return;
            }
            while (true) {
                System.out.print("Nhập MSSV mới cho index " + idx + ": ");
                String newM = sc.nextLine().trim();
                String normalized = newM.toUpperCase();
                if (isValidMSSV(normalized)) {
                    arr[idx] = normalized;
                    System.out.println("Cập nhật thành công tại index " + idx + ": " + normalized);
                    return;
                } else {
                    System.out.println("MSSV không hợp lệ. Định dạng: ^B\\d{7}$");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Index phải là số nguyên.");
        }
    }

    public static int deleteByMSSV(String[] arr, int size) {
        String target = sc.nextLine().trim();
        String normalized = target.toUpperCase();
        int foundIndex = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i].equalsIgnoreCase(normalized)) { foundIndex = i; break; }
        }
        if (foundIndex == -1) {
            System.out.println("Không tìm thấy MSSV: " + normalized);
            return size;
        }
        for (int i = foundIndex; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null;
        size--;
        System.out.println("Đã xóa MSSV: " + normalized + ". Danh sách đã dồn.");
        return size;
    }

    public static void display(String[] arr, int size) {
        System.out.println("Danh sách MSSV (" + size + "):");
        for (int i = 0; i < size; i++) {
            System.out.println(i + " -> " + arr[i]);
        }
    }

    public static boolean isValidMSSV(String s) {
        if (s == null) return false;
        return msvPartern.matcher(s).matches();
    }
}
