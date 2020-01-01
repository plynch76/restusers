package com.patricklynch.disney.restusers.controllers;

import com.patricklynch.disney.restusers.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class UserController {

    private static final Logger LOGGER = Logger.getLogger(UserController.class.getName());

        @RequestMapping("/users/{id}")
        public User findById(@PathVariable("id") int user) {
            LOGGER.log(Level.ALL, "Requested user with id: " + user);
            User usr1 = new User("Patrick", "Lynch", "letmein");
            return usr1;
        }

        @RequestMapping("/users")
        public List<User> findAllUsers() {
            User usr1 = new User("Patrick", "Lynch", "letmein");
            User usr2 = new User("Rory", "Lynch", "letmein");
            User usr3 = new User("Anna", "Lynch", "letmein");
            User usr4 = new User("Claire", "Lynch", "letmein");
            User usr5 = new User("Cole", "Richardson", "letmein");

            List<User> users = new ArrayList();
            users.add(usr1);
            users.add(usr2);
            users.add(usr3);
            users.add(usr4);
            users.add(usr5);

            return users;
        }
}
