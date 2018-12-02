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
        UserDTO u = new UserDTO();
        u.setId(newUser.getId() + 1);
        u.setName(newUser.getName());
        u.setFirstName(newUser.getFirstName());
        u.setCreateDate(new Date());
        CommonDTO<UserDTO> response = new CommonDTO(HttpStatus.OK.value(), u);
        return response;
    }

    @GetMapping("/user/{userId}")
    private CommonDTO getUserInfo() {
        CommonDTO response = new CommonDTO(HttpStatus.OK.value(), null);
        return response;
    }
}
