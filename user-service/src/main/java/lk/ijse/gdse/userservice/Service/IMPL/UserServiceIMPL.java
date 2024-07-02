package lk.ijse.gdse.userservice.Service.IMPL;

import lk.ijse.gdse.userservice.Conversion.Conversion;
import lk.ijse.gdse.userservice.Dto.UserDTO;
import lk.ijse.gdse.userservice.Repository.UserDao;
import lk.ijse.gdse.userservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Nethpali Jayaweera
 */
@Service
@Transactional
public class UserServiceIMPL implements UserService {

    @Autowired
    private UserDao userServiceDAO;
    @Autowired
    private Conversion conversion;
    @Override
    public void save(UserDTO userDTO) {
        userServiceDAO.save(conversion.convertToEntity(userDTO));
    }
}
