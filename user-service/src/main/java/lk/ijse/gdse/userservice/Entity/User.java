package lk.ijse.gdse.userservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Nethpali Jayaweera
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "user")
@Builder
@Entity
public class User {
    @Id
    private String userId;
    private String name;
    private String email;
    private String password;
    private String role;
}
