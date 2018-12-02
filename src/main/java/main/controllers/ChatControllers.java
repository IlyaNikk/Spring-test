package main.controllers;

import main.dao.ChatDAO;
import main.dto.CommonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChatControllers {

    private ChatDAO chatDao;

    public ChatControllers() {
        chatDao = new ChatDAO();
    }

    @PostMapping("/add/chat")
    private CommonDTO addUser() {
        CommonDTO response = new CommonDTO(HttpStatus.OK.value(), null);
        return response;
    }

    @GetMapping("/chat/{chatId}")
    private CommonDTO getUserInfo() {
        CommonDTO response = new CommonDTO(HttpStatus.OK.value(), null);
        return response;
    }
}
