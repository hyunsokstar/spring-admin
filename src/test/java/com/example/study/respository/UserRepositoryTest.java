package com.example.study.respository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.User;
import com.example.study.model.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDateTime;


public class UserRepositoryTest extends StudyApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        User user = new User();
        System.out.println("user : "+ user);
        user.setAccount("TestUser01");
        user.setEmail("TestUser@gmail.com");
        user.setPhoneNumber("010-1111-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");

        System.out.println();
        User newUser = userRepository.save(user);
        System.out.println("newUser : " + newUser);

    }

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }

}
