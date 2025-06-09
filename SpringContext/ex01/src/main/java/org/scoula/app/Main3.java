package org.scoula.app;

import org.scoula.config.ProjectConfig;
import org.scoula.config.ProjectConfig3;
import org.scoula.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3.class);

        Parrot p = context.getBean(Parrot.class);

        System.out.println(p);
        //생성된 객체는 등록했지만 초기화 작업이 이루어지지 않음
        System.out.println(p.getName());
    }
}
