package session03.homework03;

public class Homework03_SS03 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        if (names == null || quantities == null || names.length == 0 || names.length != quantities.length) {
            System.out.println("Dữ liệu không hợp lệ.");
            return;
        }

        int max = quantities[0];
        for (int i = 0; i < quantities.length; i++) {
            int q = quantities[i];
            if (q > max) {
                max = q;
            }
        }

        System.out.println("Sách có số lượng nhiều nhất (" + max + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("- " + names[i] + " : " + quantities[i]);
            }
        }
    }

    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        if (names == null || quantities == null || names.length == 0 || names.length != quantities.length) {
            System.out.println("Dữ liệu không hợp lệ.");
            return;
        }

        int min = quantities[0];
        for (int i = 0; i < quantities.length; i++) {
            int q = quantities[i];
            if (q < min) {
                min = q;
            }
        }

        System.out.println("Sách có số lượng ít nhất (" + min + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i] + " : " + quantities[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] names = {
                "Doraemon",
                "Dragon Ball",
                "One Piece",
                "Naruto",
                "Conan"
        };
        int[] quantities = { 12, 5, 16, 3, 7 };

        maxQuantityOfBooks(names, quantities);
        System.out.println();
        minQuantityOfBooks(names, quantities);
    }
}
