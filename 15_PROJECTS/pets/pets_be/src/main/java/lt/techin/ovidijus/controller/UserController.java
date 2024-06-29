package lt.techin.ovidijus.controller;

import lt.techin.ovidijus.dto.LoginDTO;
import lt.techin.ovidijus.dto.UserDTO;
import lt.techin.ovidijus.dto.UserLoginDTO;
import lt.techin.ovidijus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/register")
    public String registerUser(@RequestBody UserDTO userDTO) {
        return userService.registerUser(userDTO);
    }

    @PostMapping("/login")
    public ResponseEntity<UserLoginDTO> login(@RequestBody LoginDTO loginDTO) {
        UserLoginDTO loggedUser = userService.loginUser(loginDTO);
        if (loggedUser.getToken() == null) {
            return ResponseEntity.badRequest().body(loggedUser);
        }
        return ResponseEntity.ok(loggedUser);
    }

}
