package session06.homework03;

import java.util.Scanner;

public class Homework03_SS06 {
    public static final Scanner sc = new Scanner(System.in);
    public static class Product {
        private String productID;
        private String productName;
        private double price;

        public Product(String productID, String productName, double price) {
            this.productID = productID;
            this.productName = productName;
            this.price = price;
        }

        public void setPrice(double price) {
            if (price > 0) {
                this.price = price;
            } else {
                System.out.println("Giá phải lớn hơn 0!");
            }
        }

        public void displayInfo () {
            System.out.println("Mã SP: "+ productID);
            System.out.println("Tên SP: "+ productName);
            System.out.println("Giá SP: "+ price);
        }
    }
    public static void main(String[] args) {
        Product prod1 = new Product("P001", "Coca", 0.0);
        Product prod2 = new Product("P002", "Sting", 0.0);
        prod1.setPrice(10000.0);
        prod1.displayInfo();
        prod2.setPrice(-11000.0);
        prod2.displayInfo();
    }
}



