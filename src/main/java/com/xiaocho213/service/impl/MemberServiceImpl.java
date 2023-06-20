package com.xiaocho213.service.impl;

import com.xiaocho213.repository.MemberMapper;
import com.xiaocho213.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberMapper memberMapper;
}
