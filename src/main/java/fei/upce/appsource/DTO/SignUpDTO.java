package fei.upce.appsource.DTO;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpDTO {
    String firstName;
    String lastName;
    String email;
    String password;
}
