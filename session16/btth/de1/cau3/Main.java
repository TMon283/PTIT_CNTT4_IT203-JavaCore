package session16.btth.de1.cau3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final List<Person> students = new ArrayList<>();

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
                    addStudentIT(scanner);
                    break;
                case "2":
                    addStudentBiz(scanner);
                    break;
                case "3":
                    showStudents();
                    break;
                case "4":
                    deleteById(scanner);
                    break;
                case "5":
                    searchByName(scanner);
                    break;
                case "6":
                    sortByPointAsc();
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
        System.out.println("=== MENU QUAN LY HOC VIEN ===");
        System.out.println("1. Them moi hoc vien IT");
        System.out.println("2. Them moi hoc vien Biz");
        System.out.println("3. Hien thi danh sach hoc vien");
        System.out.println("4. Xoa hoc vien theo ma id");
        System.out.println("5. Tim kiem hoc vien theo ten (gan dung)");
        System.out.println("6. Sap xep hoc vien theo diem tang dan");
        System.out.println("0. Thoat");
    }

    private static void addStudentIT(Scanner scanner) {
        Person s = new StudentIT();
        s.inputData(scanner);
        students.add(s);
    }

    private static void addStudentBiz(Scanner scanner) {
        Person s = new StudentBiz();
        s.inputData(scanner);
        students.add(s);
    }

    private static void showStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sach rong.");
            return;
        }
        System.out.println("Danh sach hoc vien:");
        for (Person s : students) {
            s.displayInfo();
        }
    }

    private static void deleteById(Scanner scanner) {
        System.out.print("Nhap ma hoc vien can xoa: ");
        String id = scanner.nextLine();
        Person found = null;
        for (Person s : students) {
            if (s.getId().equalsIgnoreCase(id)) {
                found = s;
                break;
            }
        }
        if (found != null) {
            students.remove(found);
            System.out.println("Da xoa hoc vien co id: " + id);
        } else {
            System.out.println("Khong tim thay hoc vien co id: " + id);
        }
    }

    private static void searchByName(Scanner scanner) {
        System.out.print("Nhap ten can tim (gan dung): ");
        String key = scanner.nextLine().toLowerCase();
        boolean hasResult = false;
        for (Person s : students) {
            if (s.getName().toLowerCase().contains(key)) {
                s.displayInfo();
                hasResult = true;
            }
        }
        if (!hasResult) {
            System.out.println("Khong tim thay hoc vien phu hop.");
        }
    }

    private static void sortByPointAsc() {
        if (students.isEmpty()) {
            System.out.println("Danh sach rong, khong the sap xep.");
            return;
        }
        students.sort(Comparator.comparingDouble(Person::calculatePoint));
        System.out.println("Da sap xep danh sach theo diem trung binh tang dan.");
    }
}

