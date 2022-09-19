package com.example.hahaton.services.rolesService;

import com.example.hahaton.DAO.RoleDAO;
import com.example.hahaton.model.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RolesService{

    private final RoleDAO roleDAO;

    @Override
    public Role findRoleByName(String roleName) {
        return roleDAO.findRoleByName(roleName);
    }
}
