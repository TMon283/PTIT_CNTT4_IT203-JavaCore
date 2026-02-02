package session07.homework02;

public class Homework02_SS07 {
    public static class Student {
        String name;
        public Student(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // Biến nguyên thủy
        int a = 10;
        int b = a; // sao chép giá trị
        b = 20; // thay đổi b

        System.out.println("a = "+ a); // vẫn là 10
        System.out.println("b = "+ b); // đã thay đổi thành 20

        // Biến tham chiếu
        Student s1 = new Student("Hoàng");
        Student s2 = s1; // sao chép địa chỉ
        s2.name = "Tuấn"; // thay đổi thành s2

        System.out.println("Tên s1: " + s1.name); // cũng đổi thành "Tuấn"
        System.out.println("Tên s2: " + s2.name); // "Tuấn"
    }
}

