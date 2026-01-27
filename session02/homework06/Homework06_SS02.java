package session02.homework06;

import java.util.Scanner;

public class Homework06_SS02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 2; i <= 8; i++) {
            if (i != 8) {
                System.out.print("Nhập lượt mượn ngày Thứ " + i + ": ");
            } else {
                System.out.print("Nhập lượt mượn ngày Chủ Nhật: ");
            }
            int v = sc.nextInt();
            if (v == 0) {
                continue;
            }
            sum += v;
            if (v > max) max = v;
            if (v < min) min = v;
        }

        double avg = (double) sum / 7;
        System.out.println("Lượt mượn cao nhất: " + max);
        System.out.println("Lượt mượn thấp nhất: " + min);
        System.out.printf("Trung bình lượt mượn/ngày: %.2f%n", avg);
    }
}

