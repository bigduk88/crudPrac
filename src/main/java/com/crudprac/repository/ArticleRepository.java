package com.crudprac.repository;

import com.crudprac.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findAllByOrderByCreatedAtDesc();
}
