package session04.homework02;

import java.util.Scanner;

public class Homework02_SS04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, Tình trạng: Mới";

        if (description.contains("Kệ:")) {
            int start = description.indexOf("Kệ:") + 3;
            int end = description.indexOf(",", start);
            String shelfCode = description.substring(start, end).trim();
            System.out.println("Mã vị trí kệ: " + shelfCode);
            System.out.println("Mô tả mới: " + description.replace("Kệ:", "Vị trí lưu trữ:"));
        }
    }
}
