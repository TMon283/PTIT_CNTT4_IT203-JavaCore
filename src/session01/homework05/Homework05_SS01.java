package session01.homework05;

import java.util.Scanner;

public class Homework05_SS01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number;
        while (true){
            System.out.print("Nhập mã sách (4 chữ số): ");
            number = sc.nextInt();

            if (number >= 1000 && number < 9999){
                break;
            } else {
                System.out.println("Mã sách không hợp lệ, vui lòng nhập lại");
            }
        }
        int thousands, hundreds, dozens, units;
        thousands = number / 1000;
        hundreds = (number / 100) % 10;
        dozens = (number / 10) % 10;
        units = number % 10;
        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        String isValid = (sumOfFirstThreeNumber % 10 == units) ? "HỢP LỆ" : "SAI MÃ";

        System.out.println("Chữ số kiểm tra kì vọng: "+ sumOfFirstThreeNumber);
        System.out.println("Kết quả kiểm tra mã sách: "+ isValid);
    }
}
