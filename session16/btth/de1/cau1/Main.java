package session16.btth.de1.cau1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern VALID_FILE_PATTERN =
            Pattern.compile("^\\s*([^.\\s][^,]*)\\.(pdf|png|docx)\\s*$", Pattern.CASE_INSENSITIVE);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap danh sach ten tep (cach nhau boi dau phay): ");
        String input = scanner.nextLine();

        Map<String, Integer> extensionCount = new HashMap<>();

        String[] parts = input.split(",");
        for (String raw : parts) {
            String fileName = raw.trim();
            if (fileName.isEmpty()) {
                continue;
            }

            Matcher matcher = VALID_FILE_PATTERN.matcher(fileName);
            if (!matcher.matches()) {
                continue;
            }

            String extension = matcher.group(2).toLowerCase();
            extensionCount.put(extension, extensionCount.getOrDefault(extension, 0) + 1);
        }

        if (extensionCount.isEmpty()) {
            System.out.println("Khong co tep hop le nao trong chuoi vua nhap.");
        } else {
            System.out.println("Ket qua thong ke:");
            for (Map.Entry<String, Integer> entry : extensionCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        scanner.close();
    }
}
