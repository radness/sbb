package com.example.sbb.user;

import lombok.Getter;

@Getter
public enum UserRole {
    // 스프링 시큐리티는 인증뿐만 아니라 권한도 권리한다.
    // 권한 부여
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    UserRole(String value) {
        this.value = value;
    }

    private String value;
}
