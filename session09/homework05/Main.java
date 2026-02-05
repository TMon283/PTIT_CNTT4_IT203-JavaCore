package session09.homework05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("Nguyen Van A", 10000000));
        employees.add(new ProductionEmployee("Tran Thi B", 300, 20000));
        employees.add(new ProductionEmployee("Le Van C", 150, 30000));

        System.out.println("Danh sách lương nhân viên:");
        double totalSalary = 0;
        int index = 1;
        for (Employee emp : employees) {
            System.out.print(index + ". ");
            emp.displayInfo();
            totalSalary += emp.calculateSalary();
            index++;
        }

        System.out.println("\n=> TỔNG LƯƠNG CÔNG TY: " + String.format("%,.0f", totalSalary));
    }
}
