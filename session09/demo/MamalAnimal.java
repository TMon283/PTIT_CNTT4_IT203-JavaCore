package session09.demo;

import java.util.Scanner;

public class MamalAnimal extends Animal {
    private String foodType;
    private boolean isLiveWithHuman;
    private String mamalSound;

    public MamalAnimal() {
        super();
        this.foodType = "";
        this.isLiveWithHuman = false;
        this.mamalSound = "";
    }

    public MamalAnimal(String animalName, int numberOfLegs, String furColor, int everageLifeExpectancy, String foodType, boolean isLiveWithHuman, String mamalSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.foodType = foodType;
        this.isLiveWithHuman = isLiveWithHuman;
        this.mamalSound = mamalSound;
    }

    public String getFoodType() {
        return foodType;
    }
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public boolean isLiveWithHuman() {
        return isLiveWithHuman;
    }
    public void setLiveWithHuman(boolean isLiveWithHuman) {
        this.isLiveWithHuman = isLiveWithHuman;
    }

    public String getMamalSound() {
        return mamalSound;
    }
    public void setMamalSound(String mamalSound) {
        this.mamalSound = mamalSound;
    }

    @Override
    public void input() {
        System.out.println("Nhập thông tin cho MamalAnimal:");
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Kiểu thức ăn: ");
        this.foodType = sc.nextLine();
        System.out.print("Có sống với con người không? (true/false): ");
        this.isLiveWithHuman = sc.nextBoolean();
        sc.nextLine();
        System.out.print("Nhập tiếng kêu của động vật có vú: ");
        this.mamalSound = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println("===== MamalAnimal =====");
        super.display();
        System.out.println("Kiểu thức ăn: " + this.foodType);
        System.out.println("Có sống với con người: " + (this.isLiveWithHuman ? "Có" : "Không"));
        System.out.println("Tiếng kêu: " + this.mamalSound);
    }
}

