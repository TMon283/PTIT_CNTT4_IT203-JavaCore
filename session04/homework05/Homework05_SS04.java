package session04.homework05;

import java.util.*;
import java.util.regex.*;

public class Homework05_SS04 {
    public static void main(String[] args) {

        String[] logs = {
                "2026-01-26 | User: Hoang Thai Minh | Action: BORROW | BookID: BK12345",
                "2026-01-27 | User: Nguyen Doanh Tuan | Action: RETURN | BookID: BK12346",
                "2026-01-28 | User: Doan Trung Nguyen | Action: BORROW | BookID: BK12347"
        };

        String regex = "^(\\d{4}-\\d{2}-\\d{2}) \\| User: ([A-Za-z ]+) \\| Action: (BORROW|RETURN) \\| BookID: (\\w+)$";
        Pattern pattern = Pattern.compile(regex);

        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);
            if (matcher.find()) {
                String date = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookId = matcher.group(4);

                System.out.println("Ngày: " + date);
                System.out.println("Người dùng: " + user);
                System.out.println("Hành động: " + action);
                System.out.println("Mã sách: " + bookId);
                System.out.println();
            }
        }
    }
}


