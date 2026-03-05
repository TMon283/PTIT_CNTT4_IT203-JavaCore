package hn_k24_cntt4_HoangThaiMinh_005.bai3;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập biểu thức: ");
        String input = sc.nextLine();

        if (input == null || input.isEmpty()) {
            System.out.println("Biểu thức không hợp lệ");
            return;
        }

        if (isValid(input)) {
            System.out.println("Biểu thức có dấu ngoặc hợp lệ");
        } else {
            System.out.println("Biểu thức có dấu ngoặc KHÔNG hợp lệ");
        }
    }
}