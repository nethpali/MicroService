package lk.ijse.gdse.userservice.Repository;

import lk.ijse.gdse.userservice.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Nethpali Jayaweera
 */
public interface UserDao extends JpaRepository<User,String> {
}
