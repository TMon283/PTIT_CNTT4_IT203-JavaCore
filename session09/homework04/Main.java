package session09.homework04;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();

        // Gọi phương thức chung
        animal.sound(); // In ra: Gâu gâu!

        // Thử gọi phương thức riêng của Dog (không hợp lệ nếu gọi trực tiếp)
        // animal.fetchBall(); // Lỗi biên dịch

        // Dùng instanceof và ép kiểu
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.fetchBall(); // In ra: Con chó nhặt quả bóng!
        }
    }
}

