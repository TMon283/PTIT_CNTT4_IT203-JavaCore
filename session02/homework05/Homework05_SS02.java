package session02.homework05;

import java.util.Scanner;

public class Homework05_SS02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 100;
        String line;
        int days;

        System.out.println("Nhập số ngày trễ cho từng lần trả sách (999 để thoát):");

        do {
            System.out.print("Số ngày trễ: ");
            days = sc.nextInt();

            if (days == 999) {
                break;
            }

            if (days <= 0) {
                score += 5;
                System.out.println("Trả đúng hạn/sớm: +5 điểm");
            } else {
                score -= days * 2;
                System.out.println("Trả trễ " + days + " ngày: -" + (days * 2) + " điểm");
            }
        } while (true);

        System.out.println("\nTổng điểm uy tín cuối cùng: " + score);
        if (score > 120) {
            System.out.println("Xếp loại: Độc giả Thân thiết");
        } else if (score >= 80) {
            System.out.println("Xếp loại: Độc giả Tiêu chuẩn");
        } else {
            System.out.println("Xếp loại: Độc giả cần lưu ý");
        }
    }
}
