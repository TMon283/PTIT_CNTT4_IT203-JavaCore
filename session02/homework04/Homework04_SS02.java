package session02.homework04;

import java.util.Scanner;

public class Homework04_SS02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bookID = 0;

        do {
            System.out.print("Nhập ID sách mới (phải > 0): ");
            bookID = sc.nextInt();
            if (bookID <= 0) {
                System.out.println("Lỗi: ID phải là số dương. Mời nhập lại");
            }
        } while (bookID <= 0);

        System.out.printf("Xác nhận: Mã sách %d đã được ghi nhận", bookID);
    }
}
