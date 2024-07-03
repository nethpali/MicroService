package lk.ijse.gdse.paymentservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Nethpali Jayaweera
 */
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payment")
@Data
@Entity
public class Payment {
    @Id
    private String paymentId;
    private String ticketId;
    private String userId;
    private double amount;
    private Date paymentDate;
}
