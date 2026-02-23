package session10.homework03;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("Vịt Donald");
        Fish fish = new Fish("Cá Vàng");

        System.out.println("Thông tin các loài:");
        duck.swim();
        duck.fly();

        fish.swim();
    }
}

