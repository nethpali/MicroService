package lk.ijse.gdse.vehicleservice.Service;

import lk.ijse.gdse.vehicleservice.DTO.VehicleDTO;

import java.util.List;

/**
 * @author Nethpali Jayaweera
 */
public interface VehicleService {
    void save(VehicleDTO vehicleDTO);
    List<VehicleDTO> getAll();
}
