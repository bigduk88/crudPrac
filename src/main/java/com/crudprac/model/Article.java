package com.crudprac.model;

import com.crudprac.dto.ArticleRequestDto;
import lombok.CustomLog;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String contents;

    public Article(String title, String author, String contents) {
        this.title = title;
        this.author = author;
        this.contents = contents;
    }

    public Article(ArticleRequestDto requestDto) {
        this.title = title;
        this.author = author;
        this.contents = contents;
    }
}
