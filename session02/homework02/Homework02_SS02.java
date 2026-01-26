package session02.homework02;

import java.util.Scanner;

public class Homework02_SS02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã khu vực (A, B, C, D): ");
        String line = sc.nextLine().trim();

        char code = Character.toUpperCase(line.charAt(0));

        switch (code) {
            case 'A':
                System.out.println("Tầng 1: Sách Văn học");
                break;
            case 'B':
                System.out.println("Tầng 2: Sách Khoa học");
                break;
            case 'C':
                System.out.println("Tầng 3: Sách Ngoại ngữ");
                break;
            case 'D':
                System.out.println("Tầng 4: Sách Tin học");
                break;
            default:
                System.out.println("Mã nhập không hợp lệ");
        }
    }
}
