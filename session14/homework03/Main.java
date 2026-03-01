package session14.homework03;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Aspirin");
        set1.add("Caffeine");
        set1.add("Paracetamol");
        set2.add("Penicillin");
        set2.add("Aspirin");

        Set<String> warning = new HashSet<>(set1);
        warning.retainAll(set2);

        Set<String> save = new HashSet<>(set1);
        save.removeAll(set2);

        System.out.println("Cảnh báo dị ứng: "+warning);
        System.out.println("Thành phần an toàn: "+save);
    }
}
