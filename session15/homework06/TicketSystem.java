package session15.homework06;

import java.util.LinkedList;
import java.util.Queue;

public class TicketSystem {
    private Queue<Ticket> ticketQueue = new LinkedList<>();
    private int currentNumber = 0;

    public Ticket issueTicket(String time) {
        Ticket t = new Ticket(++currentNumber, time);
        ticketQueue.add(t);
        System.out.println("Phát số: " + t);
        return t;
    }

    public Ticket callNextTicket() {
        if (!ticketQueue.isEmpty()) {
            return ticketQueue.poll();
        }
        return null;
    }

    public void displayTickets() {
        System.out.println("Danh sách số thứ tự còn chờ:");
        for (Ticket t : ticketQueue) {
            System.out.println(t);
        }
    }
}

