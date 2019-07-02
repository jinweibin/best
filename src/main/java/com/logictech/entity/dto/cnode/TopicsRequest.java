package com.logictech.entity.dto.cnode;

/**
 * @author JG.Hannibal
 * @since 2019-07-02 16:52
 */
public class TopicsRequest {
    /**
     * 页数
     */
    private int page;
    /**
     * 主题分类。目前有 ask share job good
     */
    private String tab;
    /**
     * 每一页的主题数量
     */
    private int limit;
    /**
     * String 当为 false 时，不渲染。默认为 true，渲染出现的所有 markdown 格式文本。
     */
    private String mdRender;

    @Override
    public String toString() {
        return "TopicsRequest{" +
                "page=" + page +
                ", tab='" + tab + '\'' +
                ", limit=" + limit +
                ", mdRender='" + mdRender + '\'' +
                '}';
    }

    public TopicsRequest(int page, String tab, int limit, String mdRender) {
        this.page = page;
        this.tab = tab;
        this.limit = limit;
        this.mdRender = mdRender;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getMdRender() {
        return mdRender;
    }

    public void setMdRender(String mdRender) {
        this.mdRender = mdRender;
    }
}
    