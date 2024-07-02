package lk.ijse.gdse.vehicleservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Nethpali Jayaweera
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class VehicleDTO {
    private String vehicleId;
    private String brand;
    private String model;
    private String color;
}
