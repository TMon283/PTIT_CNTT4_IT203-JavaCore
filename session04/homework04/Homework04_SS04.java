package session04.homework04;

import java.util.regex.*;

public class Homework04_SS04 {
    public static void main(String[] args) {
        String regex = "[A-Z]{2}[0-9]{4}[0-9]{5}";

        String card = "TV202312345";

        if (!card.matches("^[A-Z]{2}.*")) {
            System.out.println("Thiếu tiền tố (2 chữ cái viết hoa)");
        } else if (!card.matches("^[A-Z]{2}[0-9]{4}.*")) {
            System.out.println("Năm không hợp lệ (cần 4 chữ số)");
        } else if (!card.matches("^[A-Z]{2}[0-9]{4}[0-9]{5}$")) {
            System.out.println("Mã số ngẫu nhiên không hợp lệ (cần 5 chữ số)");
        } else {
            System.out.println("Mã thẻ hợp lệ!");
        }
    }
}
