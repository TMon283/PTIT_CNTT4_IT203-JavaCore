package session03.homework04;

import java.util.Scanner;

public class Homework04_SS03 {
    public static void sortBooks(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }


    public static void displayBooks(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Mảng rỗng");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Số lượng phải lớn hơn 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Trước sắp xếp: ");
        displayBooks(arr);

        sortBooks(arr);

        System.out.print("Sau sắp xếp: ");
        displayBooks(arr);

    }
}
