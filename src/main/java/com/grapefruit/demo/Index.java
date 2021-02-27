package com.grapefruit.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 * @ModifyTime 2020/11/20 23:27:30
 */
@RestController
@RequestMapping("/")
public class Index {

    @Value("${server.port}")
    int port;

    @GetMapping("/")
    public String index(){
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
        int i = 1999;
        int n = get(i);
        return new Date() + "  Grapefruit 端口号:" + port + " " +n;
    }
    public int get(int j){
        j = j + 2;
        return j;
    }
}
