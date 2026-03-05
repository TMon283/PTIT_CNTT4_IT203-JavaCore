package session16.btth.de1.cau3;

public abstract class Person {
    protected String id;
    protected String name;
    protected int age;

    public Person() {
    }

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculatePoint();

    public abstract void displayInfo();

    public abstract void inputData(java.util.Scanner scanner);
}

