package main.controllers;

import main.dao.MessageDAO;
import main.dto.CommonDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessagesControllers {

    private MessageDAO messageDao;

    public MessagesControllers() {
        messageDao = new MessageDAO();
    }

    @PostMapping("/add/message")
    private CommonDTO addUser() {
        CommonDTO response = new CommonDTO(HttpStatus.OK.value(), null);
        return response;
    }
}
