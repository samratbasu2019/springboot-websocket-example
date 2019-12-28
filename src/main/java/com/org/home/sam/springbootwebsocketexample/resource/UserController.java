package com.org.home.sam.springbootwebsocketexample.resource;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.org.home.sam.springbootwebsocketexample.model.User;
import com.org.home.sam.springbootwebsocketexample.model.UserResponse;

@Controller
public class UserController {


    @MessageMapping("/user")
    @SendTo("/topic/user")
    public UserResponse getUser(User user) {

        return new UserResponse("Hi " + user.getName());
    }
}
