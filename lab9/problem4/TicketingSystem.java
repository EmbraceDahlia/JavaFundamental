package lab9.problem4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private Queue<Ticket> ticketQueue;
    private int nextId;

    public TicketingSystem() {
        this.ticketQueue = new LinkedList<>();
        nextId = 1;
    }

    public void addTicket(String description) {
        Ticket newTicket = new Ticket(nextId, description);
        ticketQueue.add(newTicket);
        System.out.println("Ticket added\n" + newTicket);
        nextId++;
    }

    public Ticket processTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets to process.");
            return null;
        }
        Ticket processedTicket = ticketQueue.poll();
        System.out.println("Processing ticket\n" + processedTicket);
        return processedTicket;
    }

    public Ticket viewNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in the queue.");
            return null;
        }
        Ticket nextTicket = ticketQueue.peek();
        System.out.println("Next ticket to process\n" + nextTicket);
        return nextTicket;
    }

    public int getQueueSize() {
        return ticketQueue.size();
    }
}
