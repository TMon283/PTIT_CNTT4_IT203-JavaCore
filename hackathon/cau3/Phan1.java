package hackathon.cau3;

import java.util.Scanner;

public class Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("M: ");
        int m = sc.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"]");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print("b["+i+"]");
            b[i] = sc.nextInt();
        }
        int count = 0;
        int check = b[count];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == check) {
                check = b[count++];
            }
        }
        if (check == b[b.length-1]) {
            System.out.println("Mảng B không phải mảng con của mảng A");
        } else {
            System.out.println("Mảng B là mảng con của mảng A");
        }
    }
}
