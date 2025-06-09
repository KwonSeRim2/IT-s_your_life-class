package org.scoula.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 스프링이 컴프롤러로 인식하고 bean등록
@Log4j2 //lombok 로그 설정
public class HomeController {

    @GetMapping("/") //루트 경로로 get요청 들어오면 해당 메소드 처리
    public String home() {
        log.info("================> HomController /"); //요청 확인용 로그 출력
        return "index"; // View의 이름
    }
}
