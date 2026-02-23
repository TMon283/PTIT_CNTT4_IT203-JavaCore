package session10.homework03;

public class Duck extends Animal implements Swimmable, Flyable {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " đang bơi trên mặt nước.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " đang bay trên bầu trời.");
    }
}

