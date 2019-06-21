package com.krupoderov.spring.jwtapp.repository;

import com.krupoderov.spring.jwtapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
