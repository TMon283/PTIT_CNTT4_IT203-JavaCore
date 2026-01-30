package session06.homework05;

public class Homework05_SS06 {
    public static class Book {
        private String title;
        private String author;
        private double price;

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Tên sách: " + this.title);
            System.out.println("Tác giả: " + this.author);
            System.out.println("Giá: " + this.price + " VND");
        }

        public static void main(String[] args) {
            Book book1 = new Book("Lập trình Java", "Nguyễn Văn A", 120000);
            book1.displayInfo();
        }
    }

}


