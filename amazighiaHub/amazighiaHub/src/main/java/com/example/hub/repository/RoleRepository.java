package com.example.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hub.entity.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
        Role findByRole(String role);
}
