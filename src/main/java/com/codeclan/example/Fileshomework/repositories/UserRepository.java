package com.codeclan.example.Fileshomework.repositories;

import com.codeclan.example.Fileshomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
