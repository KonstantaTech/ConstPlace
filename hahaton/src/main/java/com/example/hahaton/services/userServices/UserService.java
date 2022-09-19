package com.example.hahaton.services.userServices;

import com.example.hahaton.DTO.UserRegistrationDTO;
import com.example.hahaton.model.User;
import net.sf.json.JSONObject;

import java.util.List;

public interface UserService {

    void saveUser(UserRegistrationDTO dto);
    User findUserByEmail(String email);

}
