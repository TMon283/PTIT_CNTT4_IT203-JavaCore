package session03.homework01;

import java.util.Scanner;

public class Homework01_SS03 {
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập mã sách thứ " + (i + 1) + ": ");
            books[i] = sc.nextInt();
        }
        return books;
    }

    public static void displayLibraries(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Không có mã sách để hiển thị.");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ",arr[i]);
            if (i < arr.length - 1) System.out.printf("%d", arr[i]);;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách n: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Số lượng phải lớn hơn 0.");
            return;
        }
        int[] library = addBookToLibraries(n);
        System.out.println("Danh sách mã sách:");
        displayLibraries(library);
    }
}
