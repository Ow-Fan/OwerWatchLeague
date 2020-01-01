package com.fan.owerwatch.common.controller;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 封装的统一返回前端的实体bean
 * @project: owerwatch
 * @author: Admin
 * @date: 2019/12/1 10:14
 */
@Data
public class ResponseBean implements Serializable {

    /**
     * 操作状态
     */
    private boolean succeed;

    /**
     * 操作返回消息
     */
    private String message;

    /**
     * 操作返回数据
     */
    private Object data;

    private ResponseBean() {
    }

    public static ResponseBean getInstance() {
        return new ResponseBean();
    }

    public void success() {
        this.setSucceed(true);
        this.setMessage("Operation success!");
    }

    public ResponseBean success(String message) {
        this.success();
        this.setMessage(message);
        return this;
    }

    public void success(String message, Object data) {
        this.success(message);
        this.setData(data);
    }

    public void fail() {
        this.setSucceed(false);
        this.setMessage("Operation failed!");
    }

    public void fail(String message) {
        this.fail();
        this.setMessage(message);
    }

    public void fail(String message, Object data) {
        this.fail(message);
        this.setData(data);
    }
}
