package session16.miniProject;

public class SpaTicket implements Identifiable {
    private final String id;
    private final Pet pet;
    private final Customer customer;
    private final String serviceDescription;

    public SpaTicket(String id, Pet pet, Customer customer, String serviceDescription) {
        this.id = id;
        this.pet = pet;
        this.customer = customer;
        this.serviceDescription = serviceDescription;
    }

    @Override
    public String getId() {
        return id;
    }

    public Pet getPet() {
        return pet;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    @Override
    public String toString() {
        return "SpaTicket{" +
                "id='" + id + '\'' +
                ", pet=" + pet.getName() +
                ", customer=" + customer.getName() +
                ", service='" + serviceDescription + '\'' +
                '}';
    }
}

