package org.scoula.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.scoula.dto.MessageDTO;
import org.scoula.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/send")
@RequiredArgsConstructor
@Log4j2
public class MessageController {
//    안녕하세요 권세림씨

    private final MessageService service;

    @PostMapping("")
    public ResponseEntity<String> sendMessage(@RequestBody MessageDTO message){

        return ResponseEntity.ok(service.sendMessage(message));
    }
}
