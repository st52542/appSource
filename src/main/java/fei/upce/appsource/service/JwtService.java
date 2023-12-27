package fei.upce.appsource.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {
    String extractUserName(String token);

    boolean isTokenValid(String token, UserDetails userDetails);
}
