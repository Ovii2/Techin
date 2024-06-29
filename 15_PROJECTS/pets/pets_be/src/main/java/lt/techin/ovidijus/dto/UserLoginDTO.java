package lt.techin.ovidijus.dto;

import lombok.Data;

@Data
public class UserLoginDTO {
    private String token;
    private String message;
}
