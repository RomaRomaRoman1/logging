package org.example.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Slf4j
@Repository
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        log.info("Start retrieve all users");
        List<User> users = userRepository.findAll();
        log.info("Users were found {}", users.size());
        return users;
    }

    public void insertUser (String code) {
        log.info("Start creation user with code = {}", code);
        User newUser = new User();
        newUser.setId(21);
        newUser.setCode(code);
        newUser.setCreated(new Date());
        User user = userRepository.saveAndFlush(newUser);
        log.info("new user was created {}", user);
    }

}
