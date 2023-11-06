package com.lystudy.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author luyoung
 * @since 2023-11-06 12:07
 * description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleListVo {

    private Long id;

    /**
     * 标题
     */

    private String title;



    /**
     * 文章摘要
     */

    private String summary;

    /**
     * 所属分类id
     */

    private String categoryName;

    /**
     * 缩略图
     */

    private String thumbnail;


    /**
     * 访问量
     */
    @TableField(value = "view_count")
    private Long viewCount;


    /**
     *
     */
    @TableField(value = "create_time")
    private LocalDateTime createTime;


}
