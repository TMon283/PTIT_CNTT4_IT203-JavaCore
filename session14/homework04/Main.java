package session14.homework04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết");
        Map<String, Integer> map = new TreeMap<>();

        for (String m : list) {
            map.put(m, map.getOrDefault(m, 0) + 1);
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue() + " ca");
        }
    }
}
