package org.scoula.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Mapper
@Configuration
@PropertySource({"classpath:/application.properties"})
//@MapperScan(basePackages = {"org.scoula.mapper"})
public interface TimeMapper {
    // 어노테이션 기반 sql - 현재 시간 조회
    @Select("SELECT sysdate()")
    public String getTime();

    // getTime2()는 xml 매퍼에 sql정의 예정
    public String getTime2();
}
