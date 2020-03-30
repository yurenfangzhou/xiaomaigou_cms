package com.xiaomaigou.cms.common.utils;

import com.xiaomaigou.cms.common.constant.CommonConstant;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期时间工具类
 *
 * @author xiaomaiyun
 * @version 1.2.3
 * @date 2020/3/30 21:17
 */
public class DateTimeUtils {
    /**
     * 获取当前标准格式化日期时间
     *
     * @return 当前标准格式化日期时间
     */
    public static String getDateTime() {
        return getDateTime(new Date());
    }

    /**
     * 标准格式化日期时间
     *
     * @param date 标准格式化日期时间
     * @return
     */
    public static String getDateTime(Date date) {
        return (new SimpleDateFormat(CommonConstant.DEFAULT_DATE_TIME_FORMAT)).format(date);
    }
}
