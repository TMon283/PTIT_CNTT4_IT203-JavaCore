package session16.btth.de2.cau3;

import java.util.Scanner;

public class Apartment extends Property implements ITaxable {
    private int floor;

    public Apartment() {
    }

    public Apartment(String propertyId, String address, double area, double basePrice, int floor) {
        super(propertyId, address, area, basePrice);
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public double totalPrice() {
        return area * basePrice;
    }

    @Override
    public double calculateTax() {
        double total = totalPrice();
        if (floor >= 10) {
            return total * 0.05;
        }
        return total * 0.02;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhap ma bat dong san: ");
        this.propertyId = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        this.address = scanner.nextLine();
        System.out.print("Nhap dien tich can ho: ");
        this.area = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap don gia tren 1m2: ");
        this.basePrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap tang: ");
        this.floor = Integer.parseInt(scanner.nextLine());
    }

    public void displayInfo() {
        double total = totalPrice();
        double tax = calculateTax();
        double payment = total + tax;
        System.out.printf("Apartment | ID: %s | Dia chi: %s | Area: %.2f | Don gia: %.2f | Tang: %d | Total: %.2f | Tax: %.2f | Thanh toan: %.2f%n",
                propertyId, address, area, basePrice, floor, total, tax, payment);
    }
}

