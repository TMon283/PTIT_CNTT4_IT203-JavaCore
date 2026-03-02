package session15.homework06;

public class Patient {
    private String id;
    private String name;
    private int age;
    private String gender;

    public Patient(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Patient{id='" + id + "', name='" + name + "', age=" + age + ", gender='" + gender + "'}";
    }
}

