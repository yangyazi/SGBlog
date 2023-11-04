package com.lystudy.service;

import com.lystudy.domain.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lystudy.domain.ResponseResult;

/**
* @author luyang
* @description 针对表【sg_article(文章表)】的数据库操作Service
* @createDate 2023-11-04 21:40:17
*/
public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

}
