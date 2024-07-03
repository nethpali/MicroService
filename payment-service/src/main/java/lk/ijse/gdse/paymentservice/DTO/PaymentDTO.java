package lk.ijse.gdse.paymentservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Nethpali Jayaweera
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentDTO {
    private String paymentId;
    private String ticketId;
    private String userId;
    private double amount;
    private Date paymentDate;
}
