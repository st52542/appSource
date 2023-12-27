package fei.upce.appsource.controller;

import fei.upce.appsource.dto.JwtAuthResponseDTO;
import fei.upce.appsource.dto.SignInDTO;
import fei.upce.appsource.dto.SignUpDTO;
import fei.upce.appsource.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    @PreAuthorize("hasRole('ADMIN')")
    public String signup(@RequestBody SignUpDTO request) {
        if(authService.signup(request)){
            return "complete";
        }
        return "something go wrong";
    }

    @PostMapping("/signin")
    public JwtAuthResponseDTO signin(@RequestBody SignInDTO request) {
        return authService.signin(request);
    }
}
