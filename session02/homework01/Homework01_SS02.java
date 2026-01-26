package session02.homework01;

import java.util.Scanner;

public class Homework01_SS02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập số lượng sách: ");
        int books = sc.nextInt();

        if (age >= 18 && books <= 3) {
            System.out.println("Kết quả: Bạn ĐỦ ĐIỀU KIỆN mượn sách quý hiếm");
        } else if (age < 18) {
            System.out.printf("Kết quả: Không đủ điều kiện\n- Lý do: Bạn phải từ 18 tuổi trở lên");
        } else if (books > 3) {
            System.out.printf("Kết quả: Không đủ điều kiện\n- Lý do: Bạn đã mượn quá 3 cuốn");
        } else if (age < 18 && books > 3) {
            System.out.printf("Kết quả: Không đủ điều kiện\n- Lý do: Bạn phải từ 18 tuổi trở lên và không mượn quá 3 cuốn");
        }
    }
}
