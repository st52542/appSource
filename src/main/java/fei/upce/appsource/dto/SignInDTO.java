package fei.upce.appsource.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignInDTO {
    String email;
    String password;
}
