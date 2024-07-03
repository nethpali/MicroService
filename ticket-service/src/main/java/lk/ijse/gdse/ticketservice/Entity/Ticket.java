package lk.ijse.gdse.ticketservice.Entity;

import jakarta.persistence.*;
import lk.ijse.gdse.ticketservice.Enum.TicketStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Nethpali Jayaweera
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ticket")
@Entity
public class Ticket {
    @Id
    private String ticketId;
    private String vehicleId;
    private Date issueDate;
    @Enumerated(EnumType.STRING)
    private TicketStatus status;
    private String userId;
}
