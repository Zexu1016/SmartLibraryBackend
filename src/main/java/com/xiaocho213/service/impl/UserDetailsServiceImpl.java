package com.xiaocho213.service.impl;

import com.xiaocho213.repository.UserMapper;
import com.xiaocho213.repository.entity.User;
import com.xiaocho213.service.model.LoginUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {


    private final UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userMapper.selectByUsername(username);
        if(Objects.isNull(user)) {
            throw new UsernameNotFoundException("");
        }



        //TODO 查询对应权限

        return new LoginUser(user);
    }
}
