package com.xiaomaigou.cms.common.utils;

import com.xiaomaigou.cms.common.constant.CommonConstant;

import java.io.Serializable;

/**
 * 返回实体类
 *
 * @author xiaomaiyun
 * @version 1.2.3
 * @date 2020/3/30 21:13
 */
public class Result<T> implements Serializable {

    private static final Long serialVersionUID = 1L;

    /**
     * 返回代码,example="200"
     */
    private Integer code;

    /**
     * 返回消息,example="success"
     */
    private String msg;

    /**
     * 返回数据,example="{name:"xiaomaigou"}"
     */
    private T data;

    public Result() {
        this.code = CommonConstant.STATUS_CODE_OK;
        this.msg = "success";
    }

    public Result(T value) {
        this.code = CommonConstant.STATUS_CODE_OK;
        this.data = value;
    }

    public Result<T> put(String key, T value) {
        switch (key) {
            case "code":
                this.code = (Integer) value;
                break;
            case "msg":
                this.code = (Integer) value;
                break;
            case "data":
                this.data = value;
                break;
            default:
                break;

        }
        return this;
    }

    public Result<T> success() {
        this.msg = "success";
        this.code = CommonConstant.STATUS_CODE_OK;
        return this;
    }

    public Result<T> success(String msg) {
        this.msg = msg;
        this.code = CommonConstant.STATUS_CODE_OK;
        return this;
    }

    public Result<T> success(T obj) {
        this.data = obj;
        this.code = CommonConstant.STATUS_CODE_OK;
        return this;
    }

    public Result<T> error() {
        this.code = CommonConstant.STATUS_CODE_INTERNAL_SERVER_ERROR;
        return this;
    }

    public Result<T> error(String msg) {
        this.code = CommonConstant.STATUS_CODE_INTERNAL_SERVER_ERROR;
        this.msg = msg;
        return this;
    }

    public Result<T> error(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        return this;
    }

    public Result<T> msg(String msg) {
        this.msg = msg;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
