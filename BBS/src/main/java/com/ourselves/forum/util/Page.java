package com.ourselves.forum.util;

/**
 * Created with IntelliJ IDEA.
 * User: Ron
 * Date: 14-6-15
 * Time: 下午5:22
 * To change this template use File | Settings | File Templates.
 */
public class Page {
    private int currentpage = 1;

    private int everypage = 10;

    private int totalcount;

    private int totalpage;

    public int getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(int currentpage) {
        this.currentpage = currentpage;
    }

    public int getEverypage() {
        return everypage;
    }

    public void setEverypage(int everypage) {
        this.everypage = everypage;
    }

    public int getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(int totalcount) {
        this.totalcount = totalcount;
    }

    public int getTotalpage() {
        return totalpage;
    }

    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }

}
