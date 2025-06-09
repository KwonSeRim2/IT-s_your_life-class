package org.scoula.config;

import org.scoula.domain.Parrot;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Spring 설정 클래스 지정
public class ProjectConfig {
    @Bean // SpringContainer에 bean으로 등록 (반환값을)
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Koko");
        return p; //빈으로 등록할 객체 반환
    }

    @Bean(name="miki")
    Parrot parrot2(){
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    Parrot parrot3(){
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }

    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    int ten(){
        return 10;
    }
}
