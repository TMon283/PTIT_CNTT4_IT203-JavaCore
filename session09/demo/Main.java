package session09.demo;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        MamalAnimal mamal = new MamalAnimal();

        bird.input();
        System.out.println();
        mamal.input();
        System.out.println();

        bird.display();
        System.out.println();
        mamal.display();
    }
}
