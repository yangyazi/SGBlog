package com.lystudy.service;

import com.lystudy.domain.ResponseResult;
import com.lystudy.domain.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author luyang
* @description 针对表【sg_category(分类表)】的数据库操作Service
* @createDate 2023-11-05 15:53:01
*/
public interface CategoryService extends IService<Category> {

    ResponseResult getcategoryList();
}
