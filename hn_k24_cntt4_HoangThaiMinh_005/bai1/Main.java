package hn_k24_cntt4_HoangThaiMinh_005.bai1;

import session16.btth.de2.cau3.Property;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int sum = 0, express = 0;
        int max = -99999;
        int min = 99999;
        System.out.print("Nhập N: ");
        int n = Integer.parseInt(sc.nextLine());
        if (n <= 0) {
            System.out.println("Số lượng đơn hàng không hợp lệ");
            return;
        }
        int[] array = new int[n];
        System.out.println("\nNhập phí: ");
        for (int i = 0; i < n; i++) {
            int cost = Integer.parseInt(sc.nextLine());
            array[i] = cost;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i : array) {
            list.add(i);
        }
        for (int s : list) {
            sum += s;
            if (s >= 50) {
                express++;
            }
            if (s > max) {
                max = s;
            }
            if (s < min) {
                min = s;
            }
        }

        Set<Integer> set = new HashSet<>();
        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
        System.out.println("Average: "+ sum/n);
        System.out.println("Unique(Desc): "+ set);
        System.out.println("Express: "+ express);
    }
}
