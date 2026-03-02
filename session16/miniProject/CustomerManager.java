package session16.miniProject;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CustomerManager<T extends Customer> {
    private final Map<String, T> customersById = new HashMap<>();
    private final Set<String> phoneNumbers = new HashSet<>();

    public boolean register(T customer) {
        if (customer == null) {
            return false;
        }
        if (customersById.containsKey(customer.getId())) {
            return false;
        }
        if (phoneNumbers.contains(customer.getPhone())) {
            return false;
        }
        customersById.put(customer.getId(), customer);
        phoneNumbers.add(customer.getPhone());
        return true;
    }

    public T findById(String id) {
        return customersById.get(id);
    }

    public Collection<T> getAll() {
        return customersById.values();
    }
}

