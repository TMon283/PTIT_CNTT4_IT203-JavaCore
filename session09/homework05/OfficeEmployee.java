package session09.homework05;

public class OfficeEmployee extends Employee {
    private double baseSalary;

    public OfficeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " (Office) - Salary: " + String.format("%,.0f", calculateSalary()));
    }
}

