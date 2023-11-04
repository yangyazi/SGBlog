package com.lystudy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lystudy.domain.entity.Article;
import com.lystudy.domain.ResponseResult;
import com.lystudy.service.ArticleService;
import com.lystudy.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author luyang
* @description 针对表【sg_article(文章表)】的数据库操作Service实现
* @createDate 2023-11-04 21:40:17
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{


    @Override
    public ResponseResult hotArticleList() {
        //查询热门文章 封装成ResponseResult返回
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        //必须是正式文章
        queryWrapper.eq(Article::getStatus, 0);
        //按照浏览量进行排序
        queryWrapper.orderByDesc(Article::getViewCount);
        //最多只查询10条
        Page<Article> page = new Page(1,10);
        page(page,queryWrapper);

        List<Article> articles = page.getRecords();


        return ResponseResult.okResult(articles);
    }
}




