package org.scoula.security.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class JsonResponse {

    //일반 json응답 전송 메서드(로그인 성공 결과 등)
    public static <T> void send(HttpServletResponse response, T result) throws IOException {
        ObjectMapper om = new ObjectMapper();

        response.setContentType("application/json;charset=UTF-8");
        Writer out = response.getWriter();
        // 자바 객체 -> json 직렬화
        out.write(om.writeValueAsString(result));
        out.flush();
    }

    // 에러 응답 전송 메서드
    public static void sendError(HttpServletResponse response, HttpStatus status, String message) throws IOException{
        response.setStatus(status.value()); //http상태코드
        response.setContentType("application/json;charset-UTF-8");

        Writer out = response.getWriter();
        out.write(message); // 단순 문자열
        out.flush();
    }
}
