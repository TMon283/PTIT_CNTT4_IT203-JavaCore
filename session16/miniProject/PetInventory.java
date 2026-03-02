package session16.miniProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PetInventory<T extends Pet> {
    private final List<T> pets = new ArrayList<>();

    public void add(T pet) {
        if (pet != null) {
            pets.add(pet);
        }
    }

    public List<T> getAll() {
        return new ArrayList<>(pets);
    }

    public T findById(String id) {
        for (T pet : pets) {
            if (pet.getId().equalsIgnoreCase(id)) {
                return pet;
            }
        }
        return null;
    }

    public boolean removeById(String id) {
        Iterator<T> iterator = pets.iterator();
        while (iterator.hasNext()) {
            T pet = iterator.next();
            if (pet.getId().equalsIgnoreCase(id)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}

