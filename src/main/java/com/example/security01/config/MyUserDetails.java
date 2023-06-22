package com.example.security01.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetails implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //return null;

        //final AppUser appUser = userRepository.findByUsername(username);

        //if (appUser == null) {
            //    throw new UsernameNotFoundException("User '" + username + "' not found");
        //}

        return org.springframework.security.core.userdetails.User//
                .withUsername(username)//
                //.password(appUser.getPassword())//
                //.authorities(appUser.getAppUserRoles())//
                .password("edwin")//
                .authorities("ADMIN2")//
                .accountExpired(false)//
                .accountLocked(false)//
                .credentialsExpired(false)//
                .disabled(false)//
                .build();
    }
}
