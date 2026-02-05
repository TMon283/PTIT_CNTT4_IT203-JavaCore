package session09.homework06;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("Circle (r=" + radius + ") - Area: "
                + String.format("%.2f", calculateArea()));
    }
}

