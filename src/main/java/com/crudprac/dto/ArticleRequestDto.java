package com.crudprac.dto;

import lombok.Getter;

@Getter
public class ArticleRequestDto {
    private Long id;
    private String title;
    private String author;
    private String contents;
}
