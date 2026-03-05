package session16.btth.de1.cau2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot cau: ");
        String sentence = scanner.nextLine();

        Queue<String> queue = new LinkedList<>();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isWhitespace(c)) {
                if (currentWord.length() > 0) {
                    queue.offer(currentWord.toString());
                    currentWord.setLength(0);
                }
            } else if (Character.isLetterOrDigit(c)) {
                currentWord.append(c);
            }
        }
        if (currentWord.length() > 0) {
            queue.offer(currentWord.toString());
        }

        Deque<String> stack = new ArrayDeque<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        StringBuilder result = new StringBuilder();
        int wordIndex = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isWhitespace(c)) {
                result.append(c);
            } else if (Character.isLetterOrDigit(c)) {
                if (!stack.isEmpty()) {
                    String word = stack.pop();
                    if (wordIndex > 0) {
                        result.append(" ");
                    }
                    result.append(word);
                    wordIndex++;
                }
                while (i + 1 < sentence.length()
                        && Character.isLetterOrDigit(sentence.charAt(i + 1))) {
                    i++;
                }
            } else {
                result.append(c);
            }
        }

        System.out.println("Cau sau khi dao tu: " + result);
        scanner.close();
    }
}
