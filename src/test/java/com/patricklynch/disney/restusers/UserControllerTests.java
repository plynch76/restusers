package com.patricklynch.disney.restusers;

import com.patricklynch.disney.restusers.controllers.UserController;
import com.patricklynch.disney.restusers.models.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTests {

    @MockBean
    private UserController userController;

    @Test
    public void getAllUsersTest() throws Exception{
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

        given(userController.findAllUsers()).willReturn(users);
    }

    @Test
    public void getSingleUserTest() throws Exception{
        User user = new User("Patrick", "Lynch", "letmein");
        given(userController.findById(1)).willReturn(user);
    }
}
