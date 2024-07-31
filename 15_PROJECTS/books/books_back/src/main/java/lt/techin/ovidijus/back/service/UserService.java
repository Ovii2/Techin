package lt.techin.ovidijus.back.service;

import lt.techin.ovidijus.back.dto.login.LoginRequestDTO;
import lt.techin.ovidijus.back.dto.login.LoginResponseDTO;
import lt.techin.ovidijus.back.dto.user.UserRequestDTO;
import lt.techin.ovidijus.back.dto.user.UserResponseDTO;
import lt.techin.ovidijus.back.exceptions.UserAlreadyExistsException;
import lt.techin.ovidijus.back.model.User;
import lt.techin.ovidijus.back.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.regex.Pattern;

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

    public UserResponseDTO registerUser(UserRequestDTO userRequestDTO) throws UserAlreadyExistsException {
        if (userRepository.existsByEmail(userRequestDTO.getEmail())) {
            throw new UserAlreadyExistsException("Email already exists!");
        }
        if (userRepository.existsByUserName(userRequestDTO.getUserName())) {
            throw new UserAlreadyExistsException("This username already exists!");
        }

        validateUserName(userRequestDTO.getUserName());
        validateEmail(userRequestDTO.getEmail());
        validatePassword(userRequestDTO.getPassword());

        User user = new User();
        user.setUserName(userRequestDTO.getUserName());
        user.setEmail(userRequestDTO.getEmail());
        user.setPassword(authenticationService.encodePassword(userRequestDTO.getPassword()));
        user.setRole("USER");

        userRepository.save(user);
        return new UserResponseDTO(user.getId(), "User registered successfully!");
    }

    public LoginResponseDTO loginUser(LoginRequestDTO loginRequestDTO) {
        LoginResponseDTO response = new LoginResponseDTO();
        Optional<User> optionalUser = userRepository.findByEmail(loginRequestDTO.getEmail());
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (passwordEncoder.matches(loginRequestDTO.getPassword(), user.getPassword())) {
                response.setToken(jwtService.generateToken(user));
                response.setMessage("Login success");
                return response;
            }
        }
        response.setToken(null);
        response.setMessage("Email or password is incorrect");
        return response;
    }

    public void validateEmail(String email) {
        if (!Pattern.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", email)) {
            throw new IllegalArgumentException("Invalid email address format");
        }
    }

    public void validatePassword(String password) {
        if (password == null || password.isEmpty() || password.isBlank()) {
            throw new IllegalArgumentException("Password cannot be empty or blank");
        }
        if (!Pattern.matches(".*[A-Z].*", password)) {
            throw new IllegalArgumentException("Password must include at least one uppercase letter");
        }
        if (!Pattern.matches(".*[a-z].*", password)) {
            throw new IllegalArgumentException("Password must include at least one lowercase letter");
        }
        if (!Pattern.matches(".*\\d.*", password)) {
            throw new IllegalArgumentException("Password must include at least one number");
        }
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }
    }

    public void validateUserName(String userName) throws IllegalArgumentException {
        int min = 4;
        int max = 20;

        if (userName == null || userName.isEmpty() || userName.isBlank()) {
            throw new IllegalArgumentException("Username cannot be empty!");
        }
        if (userName.length() < min) {
            throw new IllegalArgumentException("Username must be at least 4 characters");
        }
        if (userName.length() > max) {
            throw new IllegalArgumentException("Username cannot be longer than 20 characters");
        }
        if (userName.startsWith(" ") || userName.endsWith(" ")) {
            throw new IllegalArgumentException("Username cannot start or end with a space");
        }
    }

    public Optional<User> getCurrentUser() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            String username = ((UserDetails) principal).getUsername();
            return userRepository.findByUserName(username);
        }
        return Optional.empty();
    }
}
