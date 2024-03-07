package kr.ac.kopo.test0307.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 웹과 매핑해서 실행시킬 수 있도록 무조건 설정해야됨. @Controller를 해야 비로서 Controller를 클래스로 받아들일 수 있음.
@RestController
public class SampleController {
    @GetMapping("/hello")
    public String[] hello(){
        return new String[]{"hello", "world"};
    }
}
