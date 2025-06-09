package org.scoula.config;

import org.scoula.domain.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.scoula.domain", "org.scoula.service"})
public class ProjectConfig {
//    @Bean(name = "꼬미")
//    public Dog dog1(){
//        Dog dog = new Dog();
//        dog.setName("꼬미");
//        dog.setBreed("푸들");
//        return dog;
//    }

//    @Bean(name = "밤비")
//    public Dog dog2(){
//        Dog dog = new Dog();
//        dog.setName("밤비");
//        dog.setBreed("시바견");
//        return dog;
//    }

//    @Bean(name = "해피")
//    public Dog dog3(){
//        Dog dog = new Dog();
//        dog.setName("해피");
//        dog.setBreed("진돗개");
//        return dog;
//    }
}
