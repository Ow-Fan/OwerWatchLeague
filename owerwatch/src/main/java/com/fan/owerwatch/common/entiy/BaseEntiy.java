package com.fan.owerwatch.common.entiy;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @project: owerwatch
 * @author: Admin
 * @date: 2019/12/1 19:01
 */
@Data
public class BaseEntiy implements Serializable {
    /**
     * 数据id
     */
    private Integer id;
    /**
     * 数据更新时间
     */
    private Date updateTime;
    /**
     * 数据创建时间
     */
    private Date createTime;
}
