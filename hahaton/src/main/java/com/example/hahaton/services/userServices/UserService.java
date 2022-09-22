package com.example.hahaton.services.userServices;

import com.example.hahaton.DTO.UserPersonalPageDTO;
import com.example.hahaton.DTO.UserRegistrationDTO;
import com.example.hahaton.model.User;

public interface UserService {

    void saveUser(UserRegistrationDTO dto);
    User findUserByEmail(String email);
    UserPersonalPageDTO getUserData(String email);

}
