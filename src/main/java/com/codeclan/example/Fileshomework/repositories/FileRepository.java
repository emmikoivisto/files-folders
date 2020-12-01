package com.codeclan.example.Fileshomework.repositories;

import com.codeclan.example.Fileshomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
