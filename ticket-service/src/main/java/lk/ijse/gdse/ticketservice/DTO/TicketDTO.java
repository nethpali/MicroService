package lk.ijse.gdse.ticketservice.DTO;

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
public class TicketDTO {
    private String ticketId;
    private String vehicleId;
    private Date issueDate;
    private TicketStatus status;
    private String userId;
}
