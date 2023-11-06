package com.lystudy.service;

import com.lystudy.domain.ResponseResult;
import com.lystudy.domain.entity.Link;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author luyang
* @description 针对表【sg_link(友链)】的数据库操作Service
* @createDate 2023-11-06 15:10:07
*/
public interface LinkService extends IService<Link> {

    ResponseResult getAllLink();
}
