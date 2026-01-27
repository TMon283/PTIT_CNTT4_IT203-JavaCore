package session03.homework05;

import java.util.Scanner;

public class Homework05_SS03 {
    public static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }
        if (pos == -1) return n;

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = 0;
        return n - 1;
    }

    public static void display(int[] arr, int n) {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {101, 102, 103, 104, 105};
        int n = books.length;

        while (n > 0) {
            System.out.print("Kho sách hiện tại ("+ n +" cuốn): ");
            display(books, n);

            System.out.print("Nhập mã sách cần xóa (0 để thoát): ");
            int id = sc.nextInt();
            if (id == 0) break;

            int newN = deleteBook(books, n, id);
            if (newN == n) {
                System.out.println("Không tìm thấy mã sách " + id);
            } else {
                System.out.println("Đã xóa sách mã " + id);
                n = newN;
            }
        }
    }
}

