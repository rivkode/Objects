import org.design.Ticket;
import org.design.TicketOffice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GetTicket {

    @DisplayName("티켓 가져오기")
    @Test
    void getTicket() {
        Ticket[] tickets = new Ticket[10];
        Ticket ticket1 = new Ticket();
        ticket1.setName("ticket1");
        Ticket ticket2 = new Ticket();
        ticket2.setName("ticket2");
        tickets[0] = ticket1;
        tickets[1] = ticket2;

        TicketOffice ticketOffice = new TicketOffice(10000L, tickets);
        Ticket ticket = ticketOffice.getTicket();

        System.out.println(ticket.getName() + "의 이름은 가져온 티켓");
        System.out.println(ticket1.getName() + "의 이름은 티켓1");
        System.out.println(ticket2.getName() + "의 이름은 티켓2");

        Assertions.assertEquals(ticket1.getName(), ticket.getName());
    }
}
