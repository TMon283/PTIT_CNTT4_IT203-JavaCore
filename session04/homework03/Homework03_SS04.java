package session04.homework03;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import static java.time.LocalTime.now;

public class Homework03_SS04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};
        StringBuilder sb = new StringBuilder();

        System.out.println("--- BÁO CÁO MƯỢN SÁCH ---");
        System.out.println("Ngày tạo: "+ LocalDate.now());
        for (String item: transactions) {
            sb = sb.append("Giao dịch: ").append(item).append("\n");
        }
        System.out.println(sb);
    }
}
