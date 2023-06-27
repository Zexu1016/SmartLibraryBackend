package com.xiaocho213.controller;

import com.xiaocho213.controller.request.UserDTO;
import com.xiaocho213.controller.response.SlResult;
import com.xiaocho213.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public SlResult<String> login(@RequestBody UserDTO userDTO) {
        return SlResult.success(userService.login(userDTO));
    }

}
