package kr.ac.pcu.cyber.userservice.domain.dto;

import lombok.*;

@Getter @Setter @Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponseData {

    private String accessToken;
    private String refreshToken;
    private String userId;
    private String nickname;
    private String profileUrl;

    public void complete(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }
}