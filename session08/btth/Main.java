
package session08.btth;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StudentManager manager = new StudentManager();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm");
            System.out.println("4. Cập nhật");
            System.out.println("5. Xóa");
            System.out.println("6.Tính điểm trung bình và xếp loại");
            System.out.println("7. Sắp xếp sinh viên");
            System.out.println("8. Thống kê");
            System.out.println("9. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    manager.showAll();
                    break;
                case 3:
                    System.out.print("Nhập mã hoặc tên: ");
                    manager.search(sc.nextLine());
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    System.out.print("Nhập mã SV: ");
                    System.out.println(manager.delete(sc.nextLine()) ? "Xóa thành công" : "Không tìm thấy");
                    break;
                case 6:
                    System.out.print("Nhập mã sinh viên: ");
                    String id = sc.nextLine();
                    manager.showAverageAndRank(id);
                    break;
                case 7:
                    manager.sortByAverage();
                    manager.showAll();
                    break;
                case 8:
                    manager.statistic();
                    break;
                case 9:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 9);
    }

    static void addStudent() {
        System.out.print("Mã SV: ");
        String id = sc.nextLine();
        System.out.print("Họ tên: ");
        String name = sc.nextLine();
        System.out.print("Tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Giới tính: ");
        String gender = sc.nextLine();
        System.out.print("Toán: ");
        double m = Double.parseDouble(sc.nextLine());
        System.out.print("Lý: ");
        double p = Double.parseDouble(sc.nextLine());
        System.out.print("Hóa: ");
        double c = Double.parseDouble(sc.nextLine());

        Student s = new Student(id, name, age, gender, m, p, c);
        System.out.println(manager.addStudent(s) ? "Thêm thành công" : "Thêm thất bại");
    }

    static void updateStudent() {
        System.out.print("Nhập mã SV: ");
        String id = sc.nextLine();
        System.out.print("Tên mới: ");
        String name = sc.nextLine();
        System.out.print("Tuổi mới: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Toán: ");
        double m = Double.parseDouble(sc.nextLine());
        System.out.print("Lý: ");
        double p = Double.parseDouble(sc.nextLine());
        System.out.print("Hóa: ");
        double c = Double.parseDouble(sc.nextLine());

        System.out.println(manager.update(id, name, age, m, p, c)
                ? "Cập nhật thành công"
                : "Không tìm thấy sinh viên");
    }
}
