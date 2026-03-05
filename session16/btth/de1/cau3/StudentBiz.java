package session16.btth.de1.cau3;

import java.util.Scanner;

public class StudentBiz extends Person {
    private double marketingScore;
    private double salesScore;

    public StudentBiz() {
    }

    public StudentBiz(String id, String name, int age, double marketingScore, double salesScore) {
        super(id, name, age);
        this.marketingScore = marketingScore;
        this.salesScore = salesScore;
    }

    @Override
    public double calculatePoint() {
        return (marketingScore + salesScore) / 2;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Biz | ID: %s | Ten: %s | Tuoi: %d | Marketing: %.2f | Sales: %.2f | Diem TB: %.2f%n",
                id, name, age, marketingScore, salesScore, calculatePoint());
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Nhap ma hoc vien: ");
        this.id = scanner.nextLine();
        System.out.print("Nhap ten hoc vien: ");
        this.name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap diem Marketing: ");
        this.marketingScore = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap diem Sales: ");
        this.salesScore = Double.parseDouble(scanner.nextLine());
    }
}

