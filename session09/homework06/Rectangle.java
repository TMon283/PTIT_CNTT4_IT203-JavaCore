package session09.homework06;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void displayInfo() {
        if (width == height) {
            System.out.println("Square (side=" + width + ") - Area: "
                    + String.format("%.1f", calculateArea()));
        } else {
            System.out.println("Rectangle (" + width + " x " + height + ") - Area: "
                    + String.format("%.1f", calculateArea()));
        }
    }
}

