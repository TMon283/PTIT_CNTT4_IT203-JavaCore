package session16.miniProject;

public class Pet implements Identifiable {
    private String id;
    private String name;
    private String species;
    private String breed;
    private int age;
    private double price;

    public Pet(String id, String name, String species, String breed, int age, double price) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.price = price;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}

