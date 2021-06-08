package com.crudprac.controller;

import com.crudprac.dto.ArticleRequestDto;
import com.crudprac.model.Article;
import com.crudprac.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleRepository articleRepository;

    @GetMapping("/main/aritcle/list")
    public List<Article> getArticle() {
        return articleRepository.findAllByOrderByCreatedAtDesc();
    }

    @GetMapping("/main/article/list/detail")
    public Article getDetail(@PathVariable Long id) {
        return articleRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다.")
        );
    }

    @PostMapping("main/article/list/post")
    public Article createArticle(@RequestBody ArticleRequestDto requestDto) {
        Article article = new Article(requestDto);
        articleRepository.save(article);
        return article;
    }
}
