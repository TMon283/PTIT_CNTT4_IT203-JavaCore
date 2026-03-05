package session16.btth.de2.cau3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final List<Property> properties = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("Chon chuc nang: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addApartment(scanner);
                    break;
                case "2":
                    addVilla(scanner);
                    break;
                case "3":
                    showAll();
                    break;
                case "4":
                    searchByArea(scanner);
                    break;
                case "5":
                    deleteById(scanner);
                    break;
                case "6":
                    statisticRevenue();
                    break;
                case "7":
                    sortByAreaDesc();
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("=== MENU QUAN LY BAT DONG SAN ===");
        System.out.println("1. Nhap thong tin Can ho");
        System.out.println("2. Nhap thong tin Biet thu");
        System.out.println("3. Hien thi danh sach bat dong san");
        System.out.println("4. Tim kiem bat dong san co dien tich lon hon X");
        System.out.println("5. Xoa bat dong san theo ma propertyId");
        System.out.println("6. Thong ke tong doanh thu");
        System.out.println("7. Sap xep theo dien tich giam dan");
        System.out.println("0. Thoat");
    }

    private static void addApartment(Scanner scanner) {
        Apartment apartment = new Apartment();
        apartment.inputData(scanner);
        properties.add(apartment);
    }

    private static void addVilla(Scanner scanner) {
        Villa villa = new Villa();
        villa.inputData(scanner);
        properties.add(villa);
    }

    private static void showAll() {
        if (properties.isEmpty()) {
            System.out.println("Danh sach rong.");
            return;
        }
        System.out.println("Danh sach bat dong san:");
        for (Property p : properties) {
            if (p instanceof Apartment) {
                ((Apartment) p).displayInfo();
            } else if (p instanceof Villa) {
                ((Villa) p).displayInfo();
            }
        }
    }

    private static void searchByArea(Scanner scanner) {
        System.out.print("Nhap gia tri X (dien tich) can tim: ");
        double x = Double.parseDouble(scanner.nextLine());
        boolean found = false;
        for (Property p : properties) {
            if (p.getArea() > x) {
                if (p instanceof Apartment) {
                    ((Apartment) p).displayInfo();
                } else if (p instanceof Villa) {
                    ((Villa) p).displayInfo();
                }
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co bat dong san co dien tich lon hon " + x);
        }
    }

    private static void deleteById(Scanner scanner) {
        System.out.print("Nhap ma propertyId can xoa: ");
        String id = scanner.nextLine();
        Property target = null;
        for (Property p : properties) {
            if (p.getPropertyId().equalsIgnoreCase(id)) {
                target = p;
                break;
            }
        }
        if (target != null) {
            properties.remove(target);
            System.out.println("Da xoa bat dong san co id: " + id);
        } else {
            System.out.println("Khong tim thay bat dong san co id: " + id);
        }
    }

    private static void statisticRevenue() {
        if (properties.isEmpty()) {
            System.out.println("Danh sach rong, khong co doanh thu.");
            return;
        }
        double totalRevenue = 0;
        for (Property p : properties) {
            double total = p.totalPrice();
            double tax = 0;
            if (p instanceof ITaxable) {
                tax = ((ITaxable) p).calculateTax();
            }
            totalRevenue += total + tax;
        }
        System.out.printf("Tong doanh thu tat ca bat dong san: %.2f%n", totalRevenue);
    }

    private static void sortByAreaDesc() {
        if (properties.isEmpty()) {
            System.out.println("Danh sach rong, khong the sap xep.");
            return;
        }
        properties.sort(Comparator.comparingDouble(Property::getArea).reversed());
        System.out.println("Da sap xep danh sach theo dien tich giam dan.");
    }
}

