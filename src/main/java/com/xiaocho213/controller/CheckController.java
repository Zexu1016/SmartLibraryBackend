package com.xiaocho213.controller;

import com.xiaocho213.controller.response.SlResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/check")
public class CheckController {

    @GetMapping("/oneNet")
    public SlResult<String> checkOneNET(@RequestParam(value = "msg") String msg) {
        System.out.println(msg);
        return SlResult.success(msg);
    }

}
