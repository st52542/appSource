package fei.upce.appsource.DTO;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignInDTO {
    String email;
    String password;
}
