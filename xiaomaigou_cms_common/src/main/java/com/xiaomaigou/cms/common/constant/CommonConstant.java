package com.xiaomaigou.cms.common.constant;

import java.io.Serializable;

/**
 * 公共常量
 *
 * @author xiaomaiyun
 * @version 1.2.3
 * @date 2020/3/30 21:17
 */
public class CommonConstant implements Serializable {

    private static final Long serialVersionUID = 1L;

    public static final String EMPTY_STRING = "";

    /**
     * 默认时间格式
     */
    public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    /**
     * 默认时区
     */
    public static final String DEFAULT_TIME_ZONE = "GMT+8";

    /**
     * 请求成功
     */
    public static final Integer STATUS_CODE_OK = 200;
    /**
     * 错误的请求
     */
    public static final Integer STATUS_CODE_BAD_REQUEST = 400;
    /**
     * 没有权限
     */
    public static final Integer STATUS_CODE_UNAUTHORIZED = 401;
    /**
     * 权限不足
     */
    public static final Integer STATUS_CODE_FORBIDDEN = 403;
    /**
     * 访问的内容找不到
     */
    public static final Integer STATUS_CODE_NOT_FOUND = 404;
    /**
     * 请求的资源存在冲突
     */
    public static final Integer STATUS_CODE_CONFLICT = 409;
    /**
     * 服务器内部错误
     */
    public static final Integer STATUS_CODE_INTERNAL_SERVER_ERROR = 500;

    public static final String APPLICATION_JSON = "application/json;charset=UTF-8";

    public static final String ENCODING_UTF_8 = "UTF-8";

}
