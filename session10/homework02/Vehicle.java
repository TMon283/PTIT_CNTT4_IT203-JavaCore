package session10.homework02;

public abstract class Vehicle {
    public String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void move();

    public String getBrand() {
        return brand;
    }
}
