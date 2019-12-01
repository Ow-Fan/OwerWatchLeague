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

    public ResponseBean responseSuccess() {
        this.setSucceed(true);
        this.setData(null);
        this.setMessage("Operation succeed!");
        return this;
    }

    public ResponseBean responseSuccess(String message) {
        this.setSucceed(true);
        this.setData(null);
        this.setMessage(message);
        return this;
    }

    public ResponseBean responseSuccess(String message, Object data) {
        this.setSucceed(true);
        this.setData(data);
        this.setMessage(message);
        return this;
    }

    public ResponseBean responseFail() {
        this.setSucceed(false);
        this.setData(null);
        this.setMessage("Operation fail!");
        return this;
    }

    public ResponseBean responseFail(String message) {
        this.setSucceed(false);
        this.setData(null);
        this.setMessage(message);
        return this;
    }

    public ResponseBean responseFail(String message, Object data) {
        this.setSucceed(false);
        this.setData(data);
        this.setMessage(message);
        return this;
    }

    public ResponseBean() {
    }
}
