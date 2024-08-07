package lk.ijse.gdse.userservice.Controller;

import lk.ijse.gdse.userservice.Dto.UserDTO;
import lk.ijse.gdse.userservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Nethpali Jayaweera
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService  userService;

    @GetMapping("/health")
    public String healthCheck() {
        return "User service is up and running";
    }


    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody UserDTO userDTO) {
        userService.save(userDTO);
        return ResponseEntity.ok("User saved successfully");
    }

    @PutMapping(value = "/update",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody UserDTO userDTO) {
        userService.save(userDTO);
        return ResponseEntity.ok("User updated successfully");
    }

    @GetMapping("/existUser/{userId}")
    public ResponseEntity<?> existUser(@PathVariable String userId) {
        if (userService.isExistsUser(userId)){
            return ResponseEntity.ok("User exists");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User does not exist");
        }
    }

}


