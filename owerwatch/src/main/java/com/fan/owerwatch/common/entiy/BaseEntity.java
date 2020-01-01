package com.fan.owerwatch.common.entiy;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @project: owerwatch
 * @author: Admin
 * @date: 2019/12/1 19:01
 */
@ApiModel(value = "基础实体DO")
@Data
public class BaseEntity implements Serializable {

    @ApiModelProperty(value = "主键序号id")
    private Integer id;

    @ApiModelProperty(value = "数据更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @ApiModelProperty(value = "数据创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
