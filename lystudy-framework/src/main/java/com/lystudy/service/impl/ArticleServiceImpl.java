package com.lystudy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lystudy.domain.Article;
import com.lystudy.service.ArticleService;
import com.lystudy.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

/**
* @author luyang
* @description 针对表【sg_article(文章表)】的数据库操作Service实现
* @createDate 2023-11-04 19:40:36
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

}




