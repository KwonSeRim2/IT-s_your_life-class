package org.scoula.security.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.User;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthResultDTO {
    String token;
    UserInfoDTO user;
}
