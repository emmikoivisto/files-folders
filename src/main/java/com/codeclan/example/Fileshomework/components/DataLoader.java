package com.codeclan.example.Fileshomework.components;

import com.codeclan.example.Fileshomework.models.File;
import com.codeclan.example.Fileshomework.models.Folder;
import com.codeclan.example.Fileshomework.models.User;
import com.codeclan.example.Fileshomework.repositories.FileRepository;
import com.codeclan.example.Fileshomework.repositories.FolderRepository;
import com.codeclan.example.Fileshomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){
        User user1 = new User("Bob Bobbers");
        userRepository.save(user1);

        User user2 = new User("Bert Bertman");
        userRepository.save(user2);


        Folder folder1 = new Folder("Homework", user1);
        folderRepository.save(folder1);


        File file1 = new File("Source file", "txt", 20, folder1);
        fileRepository.save(file1);

        File file2 = new File("Class file", "txt", 30, folder1);
        fileRepository.save(file2);


        folder1.addFile(file1);
        folder1.addFile(file2);
        folderRepository.save(folder1);
    }
}
