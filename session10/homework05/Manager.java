package session10.homework05;

public class Manager extends Employee implements BonusCalculator {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + getBonus();
    }

    @Override
    public String getPosition() {
        return "Manager";
    }

    @Override
    public boolean hasBonus() {
        return bonus > 0;
    }

    @Override
    public double getBonusAmount() {
        return bonus;
    }
}

