package session16.btth.de2.cau1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern HASH_PATTERN = Pattern.compile("#\\S+");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Loc hashtag bang Regex & Set ===");
        System.out.print("Nhap doan van ban: ");
        String input = scanner.nextLine();

        Set<String> hashtags = new TreeSet<>();

        Matcher matcher = HASH_PATTERN.matcher(input);
        while (matcher.find()) {
            String rawTag = matcher.group();
            String tag = rawTag.substring(1);
            if (tag.length() < 2) {
                continue;
            }
            if (!tag.matches("[A-Za-z0-9]+")) {
                continue;
            }
            hashtags.add(tag.toLowerCase());
        }

        if (hashtags.isEmpty()) {
            System.out.println("Khong co hashtag hop le.");
        } else {
            System.out.println("Danh sach hashtag (da loai trung, sap xep):");
            for (String tag : hashtags) {
                System.out.println("#" + tag);
            }
        }

        scanner.close();
    }
}
