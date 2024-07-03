package lk.ijse.gdse.ticketservice.Service.IMPL;

import lk.ijse.gdse.ticketservice.Conversion.ConversionData;
import lk.ijse.gdse.ticketservice.DTO.TicketDTO;
import lk.ijse.gdse.ticketservice.Repository.TicketDao;
import lk.ijse.gdse.ticketservice.Service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Nethpali Jayaweera
 */
@Service
@RequiredArgsConstructor
public class TicketServiceIMPL implements TicketService {
    @Autowired
    private TicketDao ticketDao;

    @Autowired
    private ConversionData conversionData;

    @Override
    public void save(TicketDTO ticketDTO) {
        ticketDao.save(conversionData.convertToEntity(ticketDTO));
    }

    @Override
    public void updateStatus(TicketDTO ticketDTO) {

    }

    @Override
    public List<TicketDTO> getAll() {
        return null;
    }

    @Override
    public boolean isExistsUser(String userId) {
        return false;
    }

    @Override
    public boolean isExistsVehicle(String vehicleId) {
        return false;
    }
}
