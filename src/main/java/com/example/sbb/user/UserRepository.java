package com.example.sbb.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// SiteUser의 PK 타입이 Long이기 때문에 JpaRepository<SiteUser, Long> 로 명명
public interface UserRepository extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findByUsername(String username);
}
