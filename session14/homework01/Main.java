package session14.homework01;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Nguyễn Văn A – Yên Bái");
        set.add("Trần Thị B – Thái Bình");
        set.add("Nguyễn Văn A – Yên Bái");
        set.add("Lê Văn C – Hưng Yên");

        System.out.println(set);
    }
}
