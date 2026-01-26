package session02.homework03;

import java.util.Scanner;

public class Homework03_SS02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách trả mượn: ");
        int numberOfBooks = sc.nextInt();
        int totalLateDay = 0;

        for (int i = 0; i < numberOfBooks; i++) {
            System.out.printf("Nhập số ngày trễ của cuốn thứ %d: ", i+1);
            int lateDay = sc.nextInt();
            totalLateDay += lateDay;
        }

        System.out.printf("===> Tổng tiền phạt: %d VNĐ", totalLateDay*5000);
    }
}
