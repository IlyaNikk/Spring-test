package main.controllers;

import main.dao.ChatDAO;
import main.dao.UserDAO;
import main.dto.ChatDTO;
import main.dto.CommonDTO;
import main.entities.Chat;
import main.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChatControllers {

    private ChatDAO chatDao;

    private UserDAO userDao;

    public ChatControllers() {
        chatDao = new ChatDAO();
        userDao = new UserDAO();
    }

    @PostMapping("/add/chat")
    private CommonDTO addUser(@RequestBody ChatDTO newUser) {
        StringBuilder responseMessage = new StringBuilder();
        try {
//            User creator = userDao.getUserInfo(newUser.getCreatorId());
//            chatDao.addNewChat(new Chat(newUser.getTitle(), creator));
        } catch (Exception ex) {
            responseMessage.append(ex.toString());
            return new CommonDTO<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), responseMessage.toString());
        }
        responseMessage.append("Chat added");
        return new CommonDTO<>(HttpStatus.OK.value(), responseMessage.toString());
    }

    @GetMapping("/chat/{chatId}")
    private CommonDTO getUserInfo(@PathVariable("chatId") Long id) {
//        Chat chat = chatDao.getChatInfo(id);
//        return new CommonDTO(HttpStatus.OK.value(), new ChatDTO(
//                chat.getId(),
//                chat.getCreator(),
//                chat.getTitle(),
//                chat.getDate()
//        ));
        return new CommonDTO(HttpStatus.OK.value(), null);
    }
}
