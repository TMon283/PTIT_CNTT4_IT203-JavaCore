package session10.homework02;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW");
        Vehicle bicycle = new Bicycle("ABC Bike");

        car.move();
        bicycle.move();
    }
}

