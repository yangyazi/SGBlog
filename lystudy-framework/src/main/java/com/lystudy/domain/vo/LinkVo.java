package com.lystudy.domain.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author luyoung
 * @since 2023-11-06 15:17
 * description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinkVo {
    /**
     *
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     *
     */
    @TableField(value = "name")
    private String name;

    /**
     *
     */
    @TableField(value = "logo")
    private String logo;

    /**
     *
     */
    @TableField(value = "description")
    private String description;

    /**
     * 网站地址
     */
    @TableField(value = "address")
    private String address;


}
