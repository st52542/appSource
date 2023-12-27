package fei.upce.appsource.service;

import fei.upce.appsource.DTO.JwtAuthResponseDTO;
import fei.upce.appsource.DTO.SignInDTO;
import fei.upce.appsource.DTO.SignUpDTO;

public interface AuthService {
    JwtAuthResponseDTO signup(SignUpDTO request);
    JwtAuthResponseDTO signin(SignInDTO request);
}
