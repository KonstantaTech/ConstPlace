package com.example.hahaton.services.userServices;

import com.example.hahaton.DAO.RoleDAO;
import com.example.hahaton.DAO.UserDAO;
import com.example.hahaton.DTO.UserRegistrationDTO;
import com.example.hahaton.model.Role;
import com.example.hahaton.model.RoleTypes;
import com.example.hahaton.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Slf4j
//@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserDAO userDAO;
    private final RoleDAO roleDAO;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userDAO.findUserByEmail(email);
        if (user == null) {
            log.error("UserDetailsService.loadUserByUsername: user not found. username: " + email);
            throw new UsernameNotFoundException("User with email: " + email + " not found");
        }
        else {
            log.info("UserDetailsService.loadUserByUsername: user found. email: " + email);
            Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
            user.getRoles().forEach(role -> {
                authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
            });
            return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
        }
    }

    @Override
    public void saveUser(UserRegistrationDTO dto) {
        String roleName = RoleTypes.ROLE_USER.name();
        Role role = roleDAO.findRoleByName(roleName);

        User newUser = User.builder()
                .name(dto.getName())
                .surname(dto.getSurname())
                .email(dto.getEmail())
                .contactNumber(dto.getContactNumber())
                .password(passwordEncoder.encode(dto.getPassword()))
                .roles(Collections.singletonList(role))
                .build();
        userDAO.save(newUser);
    }

    @Override
    public User findUserByEmail(String email) {
        return userDAO.findUserByEmail(email);
    }
}

