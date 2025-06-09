package org.scoula.app;

import org.scoula.config.ProjectConfig;
import org.scoula.domain.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Dog dog1 = context.getBean("꼬미",Dog.class);

        Dog dog2 = context.getBean("밤비",Dog.class);

        Dog dog3 = context.getBean("해피",Dog.class);


        System.out.println("[1] 등록된 강아지 목록");
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());


    }
}
