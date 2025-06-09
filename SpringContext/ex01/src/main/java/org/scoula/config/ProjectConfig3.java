package org.scoula.config;

import org.scoula.domain.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//지정된 패키지를 스캔해서 @Component가 붙은 클래스를 비능로 등록
@ComponentScan(basePackages = "org.scoula.domain")
public class ProjectConfig3 {

}
