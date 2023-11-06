package com.lystudy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lystudy.constants.SystemConstants;
import com.lystudy.domain.ResponseResult;
import com.lystudy.domain.entity.Link;
import com.lystudy.domain.vo.LinkVo;
import com.lystudy.service.LinkService;
import com.lystudy.mapper.LinkMapper;
import com.lystudy.utils.BeanCopyUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author luyang
* @description 针对表【sg_link(友链)】的数据库操作Service实现
* @createDate 2023-11-06 15:10:07
*/
@Service
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link>
    implements LinkService{

    @Override
    public ResponseResult getAllLink() {
        //查询所有审核通过的
        LambdaQueryWrapper<Link> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Link::getStatus, SystemConstants.LINK_STATUS_NORMAL);
        List<Link> links = list(queryWrapper);
        //转换成vo
        List<LinkVo> linkVos = BeanCopyUtils.copyBeanList(links, LinkVo.class);
        //封装返回
        return ResponseResult.okResult(linkVos);
    }
}




