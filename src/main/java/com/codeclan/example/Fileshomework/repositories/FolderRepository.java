package com.codeclan.example.Fileshomework.repositories;

import com.codeclan.example.Fileshomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
