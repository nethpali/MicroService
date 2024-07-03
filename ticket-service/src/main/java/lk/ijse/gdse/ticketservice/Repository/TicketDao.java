package lk.ijse.gdse.ticketservice.Repository;

import lk.ijse.gdse.ticketservice.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Nethpali Jayaweera
 */
public interface TicketDao extends JpaRepository<Ticket,String> {
}
