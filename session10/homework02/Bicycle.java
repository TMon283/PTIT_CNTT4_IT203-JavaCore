package session10.homework02;

public class Bicycle extends Vehicle {

    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " - Cách di chuyển: Di chuyển bằng cơm");
    }
}

