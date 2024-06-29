package lt.techin.ovidijus.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginDTO {

    @NotEmpty(message = "Email can't be empty")
    @Email(message = "Email should be valid")
    private String email;

    @NotEmpty(message = "Password can't be empty")
    private String password;
}
