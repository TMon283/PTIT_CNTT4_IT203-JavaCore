package session01.homework01;

import java.util.Scanner;

public class Homework01_SS01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        String bookID = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();

        System.out.print("Nhập giá bìa: ");
        double price = sc.nextDouble();

        System.out.print("Sách còn trong kho (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        int age = 2026 - publishYear;

        System.out.println("\n----- THÔNG TIN SÁCH -----");
        System.out.println("Mã sách: " + bookID);
        System.out.println("Tên sách: " + bookName.toUpperCase());
        System.out.println("Năm xuất bản: " + publishYear);
        System.out.println("Tuổi thọ sách: " + age + " năm");
        System.out.println("Giá: "+ price + " VNĐ");
        System.out.println("Tình trạng: " + (isAvailable ? "Còn sách" : "Đã mượn"));
    }
}
