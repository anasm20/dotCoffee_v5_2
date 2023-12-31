package com.waff.rest.demo.repository;

import java.util.List;

import com.waff.rest.demo.model.UserRole;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;

import com.waff.rest.demo.model.User;

//  Repository interface for performing database operations related to the User entity.
public interface UserRepository extends JpaRepository<User, String> {
    List<User> findByUserType(@NotBlank UserRole userType);

    User findUserByUsername(String username);
    boolean existsUserByUsername(String username);
    User findByEmail(String email);
}
