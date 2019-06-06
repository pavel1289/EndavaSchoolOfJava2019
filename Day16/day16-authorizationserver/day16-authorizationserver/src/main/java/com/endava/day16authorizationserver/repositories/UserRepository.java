package com.endava.day16authorizationserver.repositories;

import com.endava.day16authorizationserver.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    public Optional<User> findUserByUsername(String username);
}
