package session01.homework01;

import java.util.Scanner;

public class Homework02_SS01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trễ: ");
        int n = sc.nextInt();

        System.out.print("Nhập số lượng sách mượn: ");
        int m = sc.nextInt();

        double total = n * m * 5000;

        double totalAfter;
        if (n > 7 && m >= 3){
            totalAfter = total * 1.2;
        } else {
            totalAfter = total;
        }

        boolean lockCard = (totalAfter > 50000);

        System.out.println("Tiền phạt gốc: "+ total);
        System.out.println("Tiền phạt sau điều chỉnh: "+ totalAfter);
        System.out.println("Yêu cầu khóa thẻ: "+ lockCard);
    }
}
