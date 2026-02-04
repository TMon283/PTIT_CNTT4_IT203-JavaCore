package session09.demo;

import java.util.Scanner;

public class Bird extends Animal {
    private boolean isFly;
    private String birdSound;

    public Bird() {
        super();
        this.isFly = false;
        this.birdSound = "";
    }

    public Bird(String animalName, int numberOfLegs, String furColor, int everageLifeExpectancy, boolean isFly, String birdSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.isFly = isFly;
        this.birdSound = birdSound;
    }

    public boolean isFly() {
        return isFly;
    }
    public void setFly(boolean isFly) {
        this.isFly = isFly;
    }

    public String getBirdSound() {
        return birdSound;
    }
    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    @Override
    public void input() {
        System.out.println("Nhập thông tin cho Bird:");
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Có bay được không? (true/false): ");
        this.isFly = sc.nextBoolean();
        sc.nextLine();
        System.out.print("Nhập tiếng hót của chim: ");
        this.birdSound = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println("===== Bird =====");
        super.display();
        System.out.println("Có bay được: " + (this.isFly ? "Có" : "Không"));
        System.out.println("Tiếng hót: " + this.birdSound);
    }
}
