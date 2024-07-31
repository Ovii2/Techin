package lt.techin.ovidijus.back.dto.login;

import lombok.Data;

@Data
public class LoginResponseDTO {

    private String token;
    private String message;
}
