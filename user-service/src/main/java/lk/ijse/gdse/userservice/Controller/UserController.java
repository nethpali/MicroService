package lk.ijse.gdse.userservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nethpali Jayaweera
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @GetMapping("/health")
    public String healthCheck() {
        return "User service is up and running";
    }
}
