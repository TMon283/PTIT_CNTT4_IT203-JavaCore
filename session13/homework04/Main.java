package session13.homework04;

public class Main {
    public static void main(String[] args) {
        EmergencyRoom emer = new EmergencyRoom();

        emer.patientCheckIn("A");
        emer.patientCheckIn("B");
        emer.emergencyCheckIn("C");

        emer.treatPatient();
        emer.treatPatient();
        emer.treatPatient();
    }
}
