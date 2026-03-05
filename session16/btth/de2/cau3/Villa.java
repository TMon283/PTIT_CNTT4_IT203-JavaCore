package session16.btth.de2.cau3;

import java.util.Scanner;

public class Villa extends Property implements ITaxable {
    private double gardenArea;

    public Villa() {
    }

    public Villa(String propertyId, String address, double area, double basePrice, double gardenArea) {
        super(propertyId, address, area, basePrice);
        this.gardenArea = gardenArea;
    }

    public double getGardenArea() {
        return gardenArea;
    }

    public void setGardenArea(double gardenArea) {
        this.gardenArea = gardenArea;
    }

    @Override
    public double totalPrice() {
        return (area + gardenArea) * basePrice;
    }

    @Override
    public double calculateTax() {
        return totalPrice() * 0.10;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhap ma bat dong san: ");
        this.propertyId = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        this.address = scanner.nextLine();
        System.out.print("Nhap dien tich nha chinh: ");
        this.area = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap dien tich san vuon: ");
        this.gardenArea = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap don gia tren 1m2: ");
        this.basePrice = Double.parseDouble(scanner.nextLine());
    }

    public void displayInfo() {
        double total = totalPrice();
        double tax = calculateTax();
        double payment = total + tax;
        System.out.printf("Villa | ID: %s | Dia chi: %s | Area: %.2f | Garden: %.2f | Don gia: %.2f | Total: %.2f | Tax: %.2f | Thanh toan: %.2f%n",
                propertyId, address, area, gardenArea, basePrice, total, tax, payment);
    }
}

