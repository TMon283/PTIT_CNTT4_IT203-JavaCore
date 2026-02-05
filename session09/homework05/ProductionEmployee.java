package session09.homework05;

public class ProductionEmployee extends Employee {
    private int numOfProducts;
    private double price;

    public ProductionEmployee(String name, int numOfProducts, double price) {
        super(name);
        this.numOfProducts = numOfProducts;
        this.price = price;
    }

    @Override
    public double calculateSalary() {
        return numOfProducts * price;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " (Production) - Salary: "
                + String.format("%,.0f", calculateSalary())
                + " (" + numOfProducts + " products * " + String.format("%,.0f", price) + ")");
    }
}

