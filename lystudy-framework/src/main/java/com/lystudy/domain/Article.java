package com.lystudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 文章表
 * @TableName sg_article
 */
@TableName(value ="sg_article")
@Data
public class Article implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 文章内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 文章摘要
     */
    @TableField(value = "summary")
    private String summary;

    /**
     * 所属分类id
     */
    @TableField(value = "category_id")
    private Long category_id;

    /**
     * 缩略图
     */
    @TableField(value = "thumbnail")
    private String thumbnail;

    /**
     * 是否置顶（0否，1是）
     */
    @TableField(value = "is_top")
    private String is_top;

    /**
     * 状态（0已发布，1草稿）
     */
    @TableField(value = "status")
    private String status;

    /**
     * 访问量
     */
    @TableField(value = "view_count")
    private Long view_count;

    /**
     * 是否允许评论 1是，0否
     */
    @TableField(value = "is_comment")
    private String is_comment;

    /**
     * 
     */
    @TableField(value = "create_by")
    private Long create_by;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 
     */
    @TableField(value = "update_by")
    private Long update_by;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 删除标志（0代表未删除，1代表已删除）
     */
    @TableField(value = "del_flag")
    private Integer del_flag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}