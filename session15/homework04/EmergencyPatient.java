package session15.homework04;

public class EmergencyPatient {
    private String id;
    private String name;
    private int priority; // 1: cấp cứu, 2: thường

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPriority() { return priority; }
    public void setPriority(int priority) { this.priority = priority; }

    @Override
    public String toString() {
        String type = (priority == 1) ? "Cấp cứu" : "Thường";
        return "Patient{id='" + id + "', name='" + name + "', priority=" + type + "}";
    }
}
