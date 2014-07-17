package com.ourselves.forum.util;

/**
 * Created with IntelliJ IDEA.
 * User: Ron
 * Date: 14-6-15
 * Time: 下午5:21
 * To change this template use File | Settings | File Templates.
 */
public class PageUtil {
    public static int getTotalPage(int everyPage, int totalCount){
        return totalCount % everyPage == 0 ? totalCount / everyPage : totalCount / everyPage +1;
    }
}
