package lk.ijse.gdse.ticketservice.Service;

import lk.ijse.gdse.ticketservice.DTO.TicketDTO;

import java.util.List;

/**
 * @author Nethpali Jayaweera
 */
public interface TicketService {
    void save(TicketDTO ticketDTO);
    void updateStatus(TicketDTO ticketDTO);
    List<TicketDTO> getAll();
    boolean isExistsUser(String userId);
    boolean isExistsVehicle(String vehicleId);
}
