package session16.miniProject;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Identifiable {
    private String id;
    private String name;
    private String phone;
    private String email;
    private final List<Pet> pets = new ArrayList<>();

    public Customer(String id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void addPet(Pet pet) {
        if (pet != null) {
            pets.add(pet);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", pets=" + pets.size() +
                '}';
    }
}

