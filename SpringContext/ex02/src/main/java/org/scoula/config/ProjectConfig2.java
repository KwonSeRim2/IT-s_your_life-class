package org.scoula.config;

import org.scoula.beans.Parrot;
import org.scoula.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.scoula.beans")
public class ProjectConfig2 {

    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    // 1. 직접 메소드 호출
//    @Bean
//    public Person person(){
//        Person p = new Person();
//        p.setName("Ella");
//        p.setParrot(parrot()); //context에서 같은 이름이 있는지 찾는다 이미 있음 그거 출력
//        return p;
//    }

    // 2. 매개변수로 넘겨받기
    @Bean
    public Person person(Parrot parrot){
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot); //context에서 같은 이름이 있는지 찾는다 이미 있음 그거 출력
        return p;
    }
}
