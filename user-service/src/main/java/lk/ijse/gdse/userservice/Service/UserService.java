package lk.ijse.gdse.userservice.Service;

import lk.ijse.gdse.userservice.Dto.UserDTO;

import java.util.List;

/**
 * @author Nethpali Jayaweera
 */
public interface UserService {
    void save(UserDTO userDTO);
    boolean isExistsUser(String userId);

}
