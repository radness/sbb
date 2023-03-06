package com.example.sbb.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SiteUser {
    // Spring Security에는 User 클래스가 이미 존재함.
    // 패키지명이 달라 User 클래스명을 사용할 수 있지만 패키지 오용으로 인한 오류 발생 여지가 있기 때문에
    // SiteUser로 명명함.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;
}
