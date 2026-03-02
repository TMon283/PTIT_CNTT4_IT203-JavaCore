package session15.homework06;

public class Ticket {
    private int ticketNumber;
    private String issuedTime;

    public Ticket(int ticketNumber, String issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    @Override
    public String toString() {
        return "Ticket{number=" + ticketNumber + ", issuedTime='" + issuedTime + "'}";
    }
}
