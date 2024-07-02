package lk.ijse.gdse.userservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Nethpali Jayaweera
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private String userId;
    private String name;
    private String email;
    private String password;
    private String role;
}
