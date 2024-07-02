package lk.ijse.gdse.vehicleservice.Conversion;

import lk.ijse.gdse.vehicleservice.DTO.VehicleDTO;
import lk.ijse.gdse.vehicleservice.Entity.Vehicle;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Nethpali Jayaweera
 */
@Component
@RequiredArgsConstructor
public class ConversionData {

    private final ModelMapper modelMapper;

    public Vehicle convertToEntity(VehicleDTO vehicleDTO) {
        return modelMapper.map(vehicleDTO, Vehicle.class);
    }

    public List<VehicleDTO> convertToDTOs(List<Vehicle> vehicles) {
        return modelMapper.map(vehicles, List.class);
    }
}
