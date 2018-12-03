package main.controllers;

import main.dao.UserDAO;
import main.dto.CommonDTO;
import main.dto.UserDTO;
import main.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class UserControllers {

    private UserDAO userDao;

    public UserControllers() {
        userDao = new UserDAO();
    }

    @PostMapping("/add/user")
    private CommonDTO addUser(@RequestBody UserDTO newUser) {
        User user = new User(newUser.getName(), newUser.getFirstName());
        StringBuilder responseMessage = new StringBuilder();
        try {
//            userDao.addNewUser(user);
        } catch (Exception e) {
            responseMessage.append(e.toString());
            return new CommonDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(), responseMessage.toString());
        }
        responseMessage.append("User added");
        CommonDTO<String> response = new CommonDTO(HttpStatus.OK.value(), responseMessage.toString());
        return response;
    }

    @GetMapping("/user/{userId}")
    private CommonDTO getUserInfo(@PathVariable("userId") Long userId) {
        CommonDTO response = new CommonDTO(HttpStatus.OK.value(), null);
        return response;
    }
}
