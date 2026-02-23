package session10.homework02;

public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " - Cách di chuyển: Di chuyển bằng động cơ");
    }
}

