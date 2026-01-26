package session01.homework06;

import java.util.Scanner;

public class Homework06_SS01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ tự của sách trong hệ thống: ");
        int stt = sc.nextInt();

        int shelf = (stt - 1) / 25 + 1;
        int position = (stt - 1) % 25 + 1;
        String zone = (shelf <= 10) ? "Khu Cận" : "Khu Viễn";

        System.out.println("--- THÔNG TIN ĐỊNH VỊ ---");
        System.out.println("Sách số: "+ stt);
        System.out.println("Địa chỉ: Kệ "+ shelf +" - Vị trí: "+ position);
        System.out.println("Phân khu: "+ zone);
    }
}
