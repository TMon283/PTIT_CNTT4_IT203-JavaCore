package session11.btth;

public class Coffee extends Drink {
    private boolean hasMilk;

    public Coffee(String id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    public double calculatePrice() {
        if (hasMilk) {
            return getPrice() + 5000;
        }
        return getPrice();
    }

    @Override
    public void displayInfo() {
        if (hasMilk) {
            System.out.println("Mã: "+ id +" - Tên: "+ name +" - Giá gốc: "+ price +" - Có sữa");
        } else {
            System.out.println("Mã: "+ id +" - Tên: "+ name +" - Giá gốc: "+ price +" - Đen đá");
        }
    }
}
