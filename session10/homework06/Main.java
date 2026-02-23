package session10.homework06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200));
        products.add(new Product("Phone", 800));
        products.add(new Product("Tablet", 600));

        // Sắp xếp theo giá tăng dần bằng Anonymous Class
        products.sort(new Comparator<Product>() {
            // Anonymous Class cho phép thêm biến nội bộ nếu cần
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("Sắp xếp theo giá (Anonymous Class):");
        products.forEach(System.out::println);

        // Sắp xếp theo tên (A-Z) bằng Lambda Expression
        products.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println("\nSắp xếp theo tên (Lambda):");
        products.forEach(System.out::println);
    }
}
