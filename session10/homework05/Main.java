package session10.homework05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new OfficeStaff("An", 500.0));
        employees.add(new Manager("Binh", 1000.0, 300.0));
        employees.add(new OfficeStaff("Chi", 700.0));
        employees.add(new Manager("Dung", 1200.0, 0.0));
        employees.add(new Manager("Em", 1500.0, 500.0));

        printPayrollTable(employees);
    }

    private static void printPayrollTable(List<Employee> employees) {
        String line = "+----+----------------+--------------+------------+------------+----------+%n";
        System.out.printf(line);
        System.out.printf("| %-2s | %-14s | %-12s | %-10s | %-10s | %-8s |%n",
                "No", "Name", "Position", "BaseSalary", "Bonus", "Total");
        System.out.printf(line);

        int i = 1;
        for (Employee e : employees) {
            String name = e.getName();
            String pos = e.getPosition();
            double base = e.getBaseSalary();
            double bonus = e.getBonusAmount();
            double total = e.calculateSalary();
            String hasBonus = e.hasBonus() ? "Yes" : "No";

            System.out.printf("| %2d | %-14s | %-12s | %10.2f | %10.2f | %8.2f |%n",
                    i, name, pos, base, bonus, total);
            i++;
        }
        System.out.printf(line);
    }
}


