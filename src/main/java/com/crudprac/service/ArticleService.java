package com.crudprac.service;

import com.crudprac.dto.ArticleRequestDto;
import com.crudprac.model.Article;
import com.crudprac.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional
    public Long update(Long id, ArticleRequestDto requestDto) {
        Article articleService = articleRepository.findById(id).orElseThrow(
                () -> new IllegalIdentifierException("아이디가 존재하지 않습니다.")
        );
        articleService.update(requestDto);
        return articleService.getId();
    }
}
