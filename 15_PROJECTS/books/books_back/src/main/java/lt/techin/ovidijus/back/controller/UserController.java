package lt.techin.ovidijus.back.controller;

import lt.techin.ovidijus.back.dto.login.LoginRequestDTO;
import lt.techin.ovidijus.back.dto.user.UserRequestDTO;
import lt.techin.ovidijus.back.dto.login.LoginResponseDTO;
import lt.techin.ovidijus.back.dto.user.UserResponseDTO;
import lt.techin.ovidijus.back.exceptions.UserAlreadyExistsException;
import lt.techin.ovidijus.back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<UserResponseDTO> registerUser(@RequestBody UserRequestDTO userRequestDTO) {
        try {
            UserResponseDTO response = userService.registerUser(userRequestDTO);
            return ResponseEntity.ok(response);
        } catch (UserAlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(new UserResponseDTO(e.getMessage()));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new UserResponseDTO(e.getMessage()));
        }
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDTO) {
        LoginResponseDTO loggedUser = userService.loginUser(loginRequestDTO);
        if (loggedUser.getToken() == null) {
            return ResponseEntity.badRequest().body(loggedUser);
        }
        return ResponseEntity.ok(loggedUser);
    }
}
