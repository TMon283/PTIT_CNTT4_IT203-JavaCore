package session08.mini_project;

import java.util.Scanner;

public class Main {
    static Student[] students = new Student[100];
    static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("----- QUẢN LÝ ĐIỂM SINH VIÊN -----");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.println("-------------------------");
            System.out.print("Chọn chức năng: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    inputStudents(sc);
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    searchByRank(sc);
                    break;
                case 4:
                    sortByScoreDesc();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Chọn sai chức năng");
            }
        } while (choice != 5);
    }

    //Nhập danh sách sinh viên
    public static void inputStudents(Scanner sc) {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1));

            String id;
            while (true) {
                System.out.print("Nhập mã SV: ");
                id = sc.nextLine();
                if (id.matches("SV\\d{3}")) {
                    break;
                }
                System.out.println("Mã sinh viên không hợp lệ");
            }

            System.out.print("Nhập tên: ");
            String name = sc.nextLine();

            System.out.print("Nhập điểm trung bình: ");
            double score = sc.nextDouble();
            sc.nextLine();

            students[size++] = new Student(id, name, score);
        }
    }

    // Hiển thị sinh viên
    public static void showStudents() {
        if (size == 0) {
            System.out.println("Danh sách rỗng");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    // Tìm kiếm sinh viên theo Học lực
    public static void searchByRank(Scanner sc) {
        System.out.print("Nhập học lực cần tìm (Gioi/Kha/Trung Binh): ");
        String rank = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (students[i].getRank().equalsIgnoreCase(rank)) {
                System.out.println(students[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên phù hợp");
        }
    }

    // Sắp xếp theo học lực giảm dần
    public static void sortByScoreDesc() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp theo học lực giảm dần");
    }
}
