package com.example.sbb.question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.example.sbb.answer.Answer;
import com.example.sbb.user.SiteUser;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

    // 여러개의 질문이 한 명의 사용자에게서 작성
    @ManyToOne
    private SiteUser author; // 글쓴이

    private LocalDateTime modifyDate;

    // @ManyToMany 관계로 속성을 생성하면 새로운 테이블을 생성하여 데이터를 관리한다.
    // 테이블에는 서로 연관된 엔티티의 고유번호(id) 2개가 프라이머리 키로 되어 있기 때문에
    // N:N(다대다) 관계가 성립하는 구조
    @ManyToMany
    private Set<SiteUser> voter;
}