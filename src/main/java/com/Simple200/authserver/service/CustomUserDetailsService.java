package com.Simple200.authserver.service;

import com.Simple200.authserver.Repository.UsersRepository;
import com.Simple200.authserver.model.CustomUserDetails;
import com.Simple200.authserver.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> usersOptional = usersRepository.findByName(username);
        usersOptional
                .orElseThrow(()-> new UsernameNotFoundException("Username not found!"));

        System.out.println("6666666");

        return usersOptional.map(CustomUserDetails::new)
                .get();
    }
}
