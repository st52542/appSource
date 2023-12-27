package fei.upce.appsource.controller;

import fei.upce.appsource.DTO.JwtAuthResponseDTO;
import fei.upce.appsource.DTO.SignInDTO;
import fei.upce.appsource.DTO.SignUpDTO;
import fei.upce.appsource.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sourcedata")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public JwtAuthResponseDTO signup(@RequestBody SignUpDTO request) {
        return authService.signup(request);
    }

    @PostMapping("/signin")
    public JwtAuthResponseDTO signin(@RequestBody SignInDTO request) {
        return authService.signin(request);
    }
}
