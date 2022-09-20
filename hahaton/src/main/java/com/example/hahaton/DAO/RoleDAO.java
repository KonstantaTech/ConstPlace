package com.example.hahaton.DAO;

import com.example.hahaton.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {

    @Query("SELECT r from Role r where r.roleName = :roleName")
    Role findRoleByName(@Param("roleName") String roleName);
}
