package lk.ijse.gdse.ticketservice.Controller;

import lk.ijse.gdse.ticketservice.DTO.TicketDTO;
import lk.ijse.gdse.ticketservice.Enum.TicketStatus;
import lk.ijse.gdse.ticketservice.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Nethpali Jayaweera
 */
@RestController
@RequestMapping("api/v1/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/health")
    public String healthCheck() {
        return "Ticket service is up and running";
    }

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody TicketDTO ticketDTO) {
        ticketDTO.setStatus(TicketStatus.UNPAID);
        if (ticketService.isExistsUser(ticketDTO.getUserId())) {
            if (ticketService.isExistsVehicle(ticketDTO.getVehicleId())) {
                ticketService.save(ticketDTO);
                return ResponseEntity.ok("Ticket saved successfully");
            }else {
                return ResponseEntity.ok("Vehicle does not exists");
            }
        }else {
            return ResponseEntity.ok("User does not exists");
        }
    }
}
