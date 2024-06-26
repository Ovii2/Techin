package lt.techin.ovidijus.service;

import lt.techin.ovidijus.config.JwtService;
import lt.techin.ovidijus.dto.LoginDTO;
import lt.techin.ovidijus.dto.UserDTO;
import lt.techin.ovidijus.dto.UserLoginDTO;
import lt.techin.ovidijus.model.User;
import lt.techin.ovidijus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final AuthenticationService authenticationService;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    @Autowired
    public UserService(UserRepository userRepository, AuthenticationService authenticationService, PasswordEncoder passwordEncoder, JwtService jwtService) {
        this.userRepository = userRepository;
        this.authenticationService = authenticationService;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    public String registerUser(UserDTO userDTO) {
        if (userRepository.existsByEmail(userDTO.getEmail())) {
            return "Email already exists!";
        }
        if (userRepository.existsByUserName(userDTO.getUserName())) {
            return "This user name already exists!";
        }
        userDTO.setRole("USER");
        User user = new User(
                userDTO.getId(),
                userDTO.getUserName(),
                userDTO.getEmail(),
                authenticationService.encodePassword(userDTO.getPassword()),
                userDTO.getRole()
        );
        userRepository.save(user);
        return "User registered successfully!";
    }


    public UserLoginDTO loginUser(LoginDTO loginDTO) {
        UserLoginDTO response = new UserLoginDTO();
        Optional<User> optionalUser = userRepository.findByEmail(loginDTO.getEmail());
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (passwordEncoder.matches(loginDTO.getPassword(), user.getPassword())) {
                response.setToken(jwtService.generateToken(user));
                response.setMessage("Login success");
                return response;
            }
        }
        response.setToken(null);
        response.setMessage("Email or password is incorrect");
        return response;
    }

    public Optional<User> getCurrentUser() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            String username = ((UserDetails) principal).getUsername();
            return userRepository.findByUserName(username);
        }

        return Optional.empty();
    }


//    public boolean hasUserWithEmail(String email) {
//        return userRepository.existsByEmail(email);
//    }
//
//    public boolean existsByUserName(String userName) {
//        return userRepository.existsByUserName(userName);
//    }
//
//    public User findByUsername(String username) {
//        return userRepository.findByUserName(username);
//    }
}
