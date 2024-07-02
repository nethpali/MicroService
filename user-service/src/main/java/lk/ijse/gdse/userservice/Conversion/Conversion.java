package lk.ijse.gdse.userservice.Conversion;

import lk.ijse.gdse.userservice.Dto.UserDTO;
import lk.ijse.gdse.userservice.Entity.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * @author Nethpali Jayaweera
 */
@Component
@RequiredArgsConstructor
public class Conversion {
    private final ModelMapper modelMapper;

    public User convertToEntity(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }
}
