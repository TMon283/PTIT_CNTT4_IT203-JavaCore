package session09.homework01;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Họ tên: " + name);
        System.out.println("Tuổi: " + age);
    }
}

