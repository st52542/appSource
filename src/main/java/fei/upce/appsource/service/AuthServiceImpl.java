package fei.upce.appsource.service;

import fei.upce.appsource.dto.JwtAuthResponseDTO;
import fei.upce.appsource.dto.SignInDTO;
import fei.upce.appsource.dto.SignUpDTO;
import fei.upce.appsource.Entity.User;
import fei.upce.appsource.Entity.Role;
import fei.upce.appsource.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final UserServiceImpl userServiceImpl;
    @Autowired
    private final PasswordEncoder passwordEncoder;
    @Autowired
    private final JwtServiceImpl jwtServiceImpl;
    @Autowired
    private final AuthenticationManager authenticationManager;

    public AuthServiceImpl(UserRepository userRepository, UserServiceImpl userServiceImpl, PasswordEncoder passwordEncoder, JwtServiceImpl jwtServiceImpl, AuthenticationManager authenticationManager) {
        this.userRepository = userRepository;
        this.userServiceImpl = userServiceImpl;
        this.passwordEncoder = passwordEncoder;
        this.jwtServiceImpl = jwtServiceImpl;
        this.authenticationManager = authenticationManager;
    }

    public Boolean signup(SignUpDTO request) {
        User userCheck = userRepository.findUserByEmail(request.getEmail());
        if(Objects.isNull(userCheck) || !userCheck.getEmail().equals(request.getEmail())){
        var user = User
                .builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.ROLE_READER)
                .build();

        userServiceImpl.save(user);
        return true;
        }
        return false;
    }


    public JwtAuthResponseDTO signin(SignInDTO request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        var user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new IllegalArgumentException("Invalid email or password."));
        var jwt = jwtServiceImpl.generateToken(user);
        return JwtAuthResponseDTO.builder().token(jwt).build();
    }
}
