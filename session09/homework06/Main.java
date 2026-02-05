package session09.homework06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(6)); // hình vuông

        System.out.println("Kết quả tính toán hình học:");
        double totalArea = 0;
        int index = 1;
        for (Shape shape : shapes) {
            System.out.print(index + ". ");
            shape.displayInfo();
            totalArea += shape.calculateArea();
            index++;
        }

        System.out.println("\n=> Tổng diện tích các hình: "
                + String.format("%.2f", totalArea));
    }
}

