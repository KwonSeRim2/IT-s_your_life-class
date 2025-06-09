package org.scoula.app;

import org.scoula.config.ProjectConfig;
import org.scoula.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.Name;

public class Main {
    public static void main(String[] args) {
        //spring context 생성
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //해당 타입의 빈을 context에서 꺼내온다.
        Parrot p = context.getBean(Parrot.class);
//        Parrot p2 = context.getBean(Parrot.class);
        System.out.println(p.getName());
//        System.out.println(p2.getName());
//        System.out.println(p == p2); // true - 싱글톤 운영 default

        //동일한 타입에 대해서는 하나의 빈만 추출 가능
        //같은 타입의 빈이 여러개면 예외 방생
        String s = context.getBean(String.class);
        System.out.println(s);

        int n = context.getBean(int.class);
        System.out.println(n);

    }
}
