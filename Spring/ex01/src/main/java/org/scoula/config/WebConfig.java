package org.scoula.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import java.util.logging.Filter;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    // 루트 어플리게이션 설정 ( 서빈스, dao, db 등)
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { RootConfig.class };
    }

    //서블릿 어플리게이션 설정 (controller, viewresolver)
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { ServletConfig.class };
    }

    // dispatcherServlet의 url 매핑
    @Override
    protected String[] getServletMappings() {
        //모든 요청을 dispatcherServlet이 처리
        return new String[] { "/" };
    }

    protected Filter[] getServletCilters(){
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);

        return new Filter[] {(Filter) characterEncodingFilter};
    }

}
