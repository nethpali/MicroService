package lk.ijse.gdse.vehicleservice.Service.IMPL;

import lk.ijse.gdse.vehicleservice.Conversion.ConversionData;
import lk.ijse.gdse.vehicleservice.DTO.VehicleDTO;
import lk.ijse.gdse.vehicleservice.Repository.VehicleDao;
import lk.ijse.gdse.vehicleservice.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Nethpali Jayaweera
 */
@Service
@Transactional
public class VehicleServiceIMPL implements VehicleService {
    @Autowired
    private VehicleDao vehicleDao;

    @Autowired
    private ConversionData conversionData;

    @Override
    public void save(VehicleDTO vehicleDTO) {
        vehicleDao.save(conversionData.convertToEntity(vehicleDTO));
    }

    @Override
    public List<VehicleDTO> getAll() {
        return conversionData.convertToDTOs(vehicleDao.findAll());
    }
}
