package session09.demo;

import java.util.Scanner;

public class Animal {
    private String animalName;
    private int numberOfLegs;
    private String furColor;
    private int everageLifeExpectancy;

    public Animal() {
        this.animalName = "";
        this.numberOfLegs = 0;
        this.furColor = "";
        this.everageLifeExpectancy = 0;
    }

    public Animal(String animalName, int numberOfLegs, String furColor, int everageLifeExpectancy) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.furColor = furColor;
        this.everageLifeExpectancy = everageLifeExpectancy;
    }

    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getFurColor() {
        return furColor;
    }
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getEverageLifeExpectancy() {
        return everageLifeExpectancy;
    }
    public void setEverageLifeExpectancy(int everageLifeExpectancy) {
        this.everageLifeExpectancy = everageLifeExpectancy;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên động vật: ");
        this.animalName = sc.nextLine();
        System.out.print("Nhập số chân: ");
        this.numberOfLegs = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập màu lông: ");
        this.furColor = sc.nextLine();
        System.out.print("Nhập tuổi thọ trung bình: ");
        this.everageLifeExpectancy = sc.nextInt();
        sc.nextLine();
    }

    public void display() {
        System.out.println("----- Thông tin Animal -----");
        System.out.println("Tên: " + this.animalName);
        System.out.println("Số chân: " + this.numberOfLegs);
        System.out.println("Màu lông: " + this.furColor);
        System.out.println("Tuổi thọ trung bình: " + this.everageLifeExpectancy);
    }
}
