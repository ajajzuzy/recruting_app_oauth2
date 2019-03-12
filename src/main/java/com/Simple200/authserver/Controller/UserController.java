package com.Simple200.authserver.Controller;

import com.Simple200.authserver.Repository.UsersRepository;
import com.Simple200.authserver.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UsersRepository usersRepository;

        @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/users")
    public Users newUser(@RequestBody Users newUser){
        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
        return usersRepository.save(newUser);
    }
}
