package com.lystudy.ArticleController;

import com.lystudy.domain.Article;
import com.lystudy.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author luyoung
 * @since 2023-11-04 19:44
 * description
 */

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService service;


    @GetMapping("/list")
    public List<Article> test(){
        return service.list();
    }
}
