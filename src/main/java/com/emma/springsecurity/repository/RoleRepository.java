package com.emma.springsecurity.repository;

import java.util.Optional;

import com.emma.springsecurity.models.ERole;
import com.emma.springsecurity.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}