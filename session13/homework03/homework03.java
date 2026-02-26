package session13.homework03;

import java.util.*;

public class homework03 {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> result = new ArrayList<>();
        for (T item : listA) {
            if (listB.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> listA1 = Arrays.asList(101, 102, 105);
        List<Integer> listB1 = Arrays.asList(102, 105, 108);
        List<Integer> common1 = findCommonPatients(listA1, listB1);
        System.out.println("Test Case 1 Output: " + common1);

        List<String> listA2 = Arrays.asList("DN01", "DN02", "DN03");
        List<String> listB2 = Arrays.asList("DN02", "DN04");
        List<String> common2 = findCommonPatients(listA2, listB2);
        System.out.println("Test Case 2 Output: " + common2);
    }
}
