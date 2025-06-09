package org.scoula.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//스프링이 감지하여 빈으로 등록
@Component //class명이 이름이 됨
public class Parrot {
    private String name;

    @PostConstruct // 빈이 생성된 후 자동으로 호출 -> 초기화
    public void init(){
        this.name = "Kiki";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
