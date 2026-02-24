package session11.btth;

public abstract class Drink {
    public String id;
    public String name;
    public double price;

    public Drink(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculatePrice();

    public void displayInfo() {
        System.out.println("Mã: "+ id +" - Tên: "+ name +" - Giá gốc: "+ price);
    }
}
