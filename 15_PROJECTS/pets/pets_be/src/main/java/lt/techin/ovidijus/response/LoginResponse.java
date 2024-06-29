package lt.techin.ovidijus.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoginResponse {

    String message;
    Boolean status;
}
