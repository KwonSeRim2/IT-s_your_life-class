package org.scoula.security.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
@Log4j2
@EnableWebSecurity //spring security 활성화
@MapperScan(basePackages = {
        "org.scoula.security.account.mapper"
})
@ComponentScan(basePackages = {"org.scoula.security"})
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsService userDetailsService;

    // 문자셋 필터
    public CharacterEncodingFilter encodingFilter() {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        encodingFilter.setForceEncoding(true);
        return encodingFilter;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // csrf 필터보다 먼저 문자셋 필터 적용
        http.addFilterBefore(encodingFilter(), CsrfFilter.class);


        http.authorizeRequests()
                .antMatchers("/security/all").permitAll() //모든 사용자 접근 허용
                .antMatchers("/security/admin").access("hasRole('ROLE_ADMIN')") //admin 권함 보유자만
                .antMatchers("/security/member").access("hasAnyRole('ROLE_MEMBER', 'ROLE_ADMIN')"); //member, admin 모두

        http.formLogin()
                .loginPage("/security/login") //커스텀 로그인 페이지 (get 요청)
                .loginProcessingUrl("/security/login") // 로그인 요청 처리 경로(post)
                .defaultSuccessUrl("/"); //로그인 성공 시 리다이렉트될 페이지

        http.logout()
                .logoutUrl("/security/logout")
                .invalidateHttpSession(true)
                .deleteCookies("remember-me", "JSESSION-ID")
                .logoutSuccessUrl("/security/logout");

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth
                .userDetailsService(userDetailsService)
                        .passwordEncoder(passwordEncoder());

        log.info("configure......................................");

        auth.inMemoryAuthentication()
                .withUser("admin")
//                .password("{noop}1234") //평문 비밀번호 (비권장)
                .password("$2a$10$hUpRWM7L3f6voT2wA8U7Jewq7KAUPZxzzDnTt/aLo6eoPGeH5lQMi")
                .roles("ADMIN", "MEMBER");

        auth.inMemoryAuthentication()
                .withUser("member")
//                .password("{noop}1234")
                .password("$2a$10$US/5NgBD6wWrE1ZCnv.3j.jxeiTkQjz4sMpbyAC9hglcd6XeJpZY6")
                .roles("MEMBER");
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


}
