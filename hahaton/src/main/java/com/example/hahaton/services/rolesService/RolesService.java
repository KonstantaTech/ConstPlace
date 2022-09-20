package com.example.hahaton.services.rolesService;

import com.example.hahaton.model.Role;
import org.springframework.stereotype.Service;

@Service
public interface RolesService {

    Role findRoleByName(String roleName);
}
