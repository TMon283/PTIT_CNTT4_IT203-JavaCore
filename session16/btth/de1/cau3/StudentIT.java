package session16.btth.de1.cau3;

import java.util.Scanner;

public class StudentIT extends Person {
    private double javaScore;
    private double htmlScore;

    public StudentIT() {
    }

    public StudentIT(String id, String name, int age, double javaScore, double htmlScore) {
        super(id, name, age);
        this.javaScore = javaScore;
        this.htmlScore = htmlScore;
    }

    @Override
    public double calculatePoint() {
        return (javaScore * 2 + htmlScore) / 3;
    }

    @Override
    public void displayInfo() {
        System.out.printf("IT | ID: %s | Ten: %s | Tuoi: %d | Java: %.2f | HTML: %.2f | Diem TB: %.2f%n",
                id, name, age, javaScore, htmlScore, calculatePoint());
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Nhap ma hoc vien: ");
        this.id = scanner.nextLine();
        System.out.print("Nhap ten hoc vien: ");
        this.name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap diem Java: ");
        this.javaScore = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap diem HTML: ");
        this.htmlScore = Double.parseDouble(scanner.nextLine());
    }
}

