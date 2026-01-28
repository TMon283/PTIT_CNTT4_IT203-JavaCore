package session04.homework01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

public class Homework01_SS04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String author = sc.nextLine();

        title = title.replaceAll("\\s+", " ").trim().toUpperCase();
        author = author.replaceAll("\\s+", " ").trim();

        author = author.toLowerCase();

        String[] word = author.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String w : word) {
            if (w.length() > 0) {
                sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
            }
        }

        String formattedAuthor = sb.toString().trim();

        System.out.println("[" + title + "] - Tác giả: [" + formattedAuthor + "]");
    }
}
