package org.scoula.config;

import org.scoula.domain.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Spring 설정 클래스 지정
public class ProjectConfig2 {
    @Bean // SpringContainer에 bean으로 등록 (반환값을)
    Parrot parrot1(){
        var p = new Parrot();
        p.setName("Koko");
        return p; //빈으로 등록할 객체 반환
    }

    @Bean(name="miki") //bean의 이릉을 지정
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


}
