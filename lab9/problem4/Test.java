package lab9.problem4;

public class Test {
    public static void main(String[] args) {
        TicketingSystem system = new TicketingSystem();

        system.addTicket("Occasional Cloudflare issue");
        system.addTicket("Print issue");
        system.addTicket("Home page load takes too long");

        Ticket v1 = system.viewNextTicket();

        Ticket t1 = system.processTicket();
        if (t1 != null)
            System.out.printf("The ticket id %d is closed.%n", t1.getId());
        Ticket t2 = system.processTicket();
        if (t2 != null)
            System.out.printf("The ticket id %d is closed.%n", t2.getId());

        System.out.println("Remaining ticket count: " + system.getQueueSize());

        system.addTicket("New feature request");

        system.viewNextTicket();

        system.processTicket();
        system.processTicket();
        system.processTicket();
    }
}
