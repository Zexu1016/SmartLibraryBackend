package com.xiaocho213.service.impl;

import com.xiaocho213.repository.UserMapper;
import com.xiaocho213.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
}