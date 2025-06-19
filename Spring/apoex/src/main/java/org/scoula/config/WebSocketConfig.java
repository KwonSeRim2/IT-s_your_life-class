package org.scoula.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    // 메시지 브로커 구성 메소드
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        //서버가 이 주소로 메시지 발행 시 구독자 모두가 수신 (구독시 사용할 접두어)
        config.enableSimpleBroker("/topic");

        //클라이언트가 메시지를 보낼 주소 (prefix), @MessageMapping과 연결
        config.setApplicationDestinationPrefixes("/app");
    }

    //STOMP 연결 엔트포인트 설정 메소드
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //클라이언트가 최초 webSocket연결 요청시 사용할 엔드포인트
        registry.addEndpoint("/chat-app")
                .setAllowedOrigins("*"); //crops설정 (모든 오리진에서 접속 허용)
    }
}
