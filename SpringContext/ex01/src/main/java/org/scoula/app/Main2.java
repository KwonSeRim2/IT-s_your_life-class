package org.scoula.app;

import org.scoula.config.ProjectConfig;
import org.scoula.config.ProjectConfig2;
import org.scoula.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        //spring context 생성
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);

        //NoUniqueBeanDefinitionException 발생
//        Parrot p = context.getBean(Parrot.class);
//        System.out.println(p.getName());

        //이름을 중복되지 않도록 지젖하여 추출 가능
        Parrot p = context.getBean("miki",Parrot.class);
        System.out.println(p.getName());


    }
}
