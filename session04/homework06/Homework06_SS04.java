package session04.homework06;

import java.util.regex.*;

public class Homework06_SS04 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất ngu ngốc, nội dung thật là rác và không đáng đọc";

        String[] blacklist = {"tệ", "ngu ngốc", "rác"};

        for (String word : blacklist) {
            String stars = "*".repeat(word.length());
            review = review.replaceAll("(?i)\\b" + word + "\\b", stars);
        }

        if (review.length() > 200) {
            int cutIndex = review.lastIndexOf(" ", 200);
            StringBuilder sb = new StringBuilder(review.substring(0, cutIndex));
            sb.append("...");
            review = sb.toString();
        }

        System.out.println("Review sau khi xử lý: ");
        System.out.println(review);
    }
}

