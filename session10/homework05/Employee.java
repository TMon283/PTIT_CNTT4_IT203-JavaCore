package session10.homework05;

public abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

    public abstract String getPosition();

    public boolean hasBonus() {
        return false;
    }

    public double getBonusAmount() {
        return 0.0;
    }
}


