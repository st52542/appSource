package fei.upce.appsource.service;

import fei.upce.appsource.dto.JwtAuthResponseDTO;
import fei.upce.appsource.dto.SignInDTO;
import fei.upce.appsource.dto.SignUpDTO;

public interface AuthService {
    Boolean signup(SignUpDTO request);
    JwtAuthResponseDTO signin(SignInDTO request);
}
