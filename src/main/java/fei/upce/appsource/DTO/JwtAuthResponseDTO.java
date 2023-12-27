package fei.upce.appsource.DTO;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtAuthResponseDTO {
    String token;
}
