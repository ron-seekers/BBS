package com.ourselves.forum.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Ron
 * Date: 14-6-15
 * Time: 下午5:23
 * To change this template use File | Settings | File Templates.
 */
public class DateUtil {

    public static Date getSqlDate(){
        Date date = new Date(System.currentTimeMillis());
        return date;
    }

    public static String getUtilDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return sdf.format(new java.util.Date());
    }

}
