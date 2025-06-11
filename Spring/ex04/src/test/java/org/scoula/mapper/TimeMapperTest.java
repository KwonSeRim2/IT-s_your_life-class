package org.scoula.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { RootConfig.class })
@Slf4j
public class TimeMapperTest {
    @Autowired
    private TimeMapper timeMapper; //timeMaptter 인터페이스

    @Test
    @DisplayName("TimeMapper의 getTime")
    void getTime() {
        //프록시로 생성도니 구현 글래스 이름 출력
        log.info(timeMapper.getClass().getName());
        // 실제 db에서 현재 시간 가져오기
        log.info(timeMapper.getTime());
    }

    @Test
    @DisplayName("TimeMapper의 getTime2")
    public void getTime2(){
        log.info("getTime2");
        log.info(timeMapper.getTime2());
    }



}