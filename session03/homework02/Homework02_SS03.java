package session03.homework02;

import java.util.Scanner;

public class Homework02_SS03 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(search)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] books = {
                "Doraemon",
                "Dragon Ball",
                "One Piece",
                "Naruto",
                "Conan"
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách cần tìm: ");
        String name = sc.nextLine();

        int pos = searchBooks(books, name);
        if (pos >= 0) {
            System.out.println("Tìm thấy sách "+ name +" tại vị trí " + pos);
        } else {
            System.out.println("Sách không tồn tại trong thư viện");
        }
    }
}


