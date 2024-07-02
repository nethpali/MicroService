package lk.ijse.gdse.vehicleservice.Repository;

import lk.ijse.gdse.vehicleservice.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Nethpali Jayaweera
 */
public interface VehicleDao extends JpaRepository<Vehicle,String> {
}
