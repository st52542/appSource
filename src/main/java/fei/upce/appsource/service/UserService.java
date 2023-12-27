package fei.upce.appsource.service;

import fei.upce.appsource.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    UserDetailsService userDetailsService();
    User save(User newUser);
}
