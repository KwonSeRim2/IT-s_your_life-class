package org.scoula.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import java.util.logging.Filter;
@Slf4j
@Configuration
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { ServletConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    protected Filter[] getServletCilters(){
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);

        return new Filter[] {(Filter) characterEncodingFilter};
    }

    final String LOCATION = "C:/upload";
    final long MAX_FILE_SIZE = 1024*1024*10L;//10M
    final long NAX_REQUEST_SIZE = 1024*1024*20L;
    final int FILE_SIZE_THRESHOLD = 1024*1024*5;

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setInitParameter("throwExceptionIfNoHandlerFound", "true");

        MultipartConfigElement multipartConfig =  new MultipartConfigElement(
                LOCATION, MAX_FILE_SIZE, NAX_REQUEST_SIZE, FILE_SIZE_THRESHOLD
        );
        registration.setMultipartConfig(multipartConfig);
    }
}
