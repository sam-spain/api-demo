package com.coolcare.apidemo.repository;

import com.coolcare.apidemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Defines a repository which provides an API or a list of helpful functions
// that helps us to work with the User entity
public interface UserRepository extends JpaRepository<User, Long> {
    // Defines a custom method to find a User using the email attribute
    public Optional<User> findByEmail(String email);
}
