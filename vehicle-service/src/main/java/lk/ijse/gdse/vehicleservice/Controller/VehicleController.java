package lk.ijse.gdse.vehicleservice.Controller;

import lk.ijse.gdse.vehicleservice.DTO.VehicleDTO;
import lk.ijse.gdse.vehicleservice.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Nethpali Jayaweera
 */
@RestController
@RequestMapping("api/v1/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/health")
    public String healthCheck() {
        return "Vehicle Service is up and running";
    }
    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody VehicleDTO vehicleDTO) {
        vehicleService.save(vehicleDTO);
        return ResponseEntity.ok("Vehicle saved successfully");
    }
    @PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody VehicleDTO vehicleDTO) {
        vehicleService.save(vehicleDTO);
        return ResponseEntity.ok("Vehicle updated successfully");
    }
    @GetMapping("/getAllVehicles")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(vehicleService.getAll());
    }


}
