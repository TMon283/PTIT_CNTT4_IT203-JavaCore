package session01.homework01;

import java.util.Scanner;

public class Homework04_SS01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá sách (USD): ");
        double price = sc.nextDouble();

        float rate = 25450;

        double total = price * rate;

        long totalPrice = (long)total;

        System.out.println("Giá chính xác (số thực): "+ total);
        System.out.println("Giá làm tròn để thanh toán (long): "+ totalPrice);
    }
}
