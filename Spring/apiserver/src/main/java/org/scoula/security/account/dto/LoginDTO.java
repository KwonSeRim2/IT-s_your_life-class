package org.scoula.security.account.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.security.authentication.BadCredentialsException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginDTO {
    private String username;
    private String password;

    public static LoginDTO of(HttpServletRequest request){
        ObjectMapper om = new ObjectMapper(); //jackson 객체
        //요청 body에서 username password를 파싱해서 loginDTO로 매핑 (역직렬화)
        try {
            return om.readValue(request.getInputStream(), LoginDTO.class);
        }catch (Exception e){ // 파싱 실패
            throw new BadCredentialsException("user 도는 password가 없습니다.");
        }
    }
}
