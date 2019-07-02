package com.logictech.entity.dto.cnode;

import java.util.Date;

/**
 * @author JG.Hannibal
 * @since 2019-07-02 16:46
 */
public class TopicItem {
    /**
     * id
     */
    private String id;
    /**
     * 作者 ID
     */
    private String authorId;
    /**
     * tab
     */
    private String tab;
    /**
     * content
     */
    private String content;
    /**
     * title
     */
    private String title;
    /**
     * lastReplyAt
     */
    private Date lastReplyAt;
    /**
     * good
     */
    private boolean good;
    /**
     * top
     */
    private boolean top;
    /**
     * reply_count
     */
    private int replyCount;
    /**
     * visit_count
     */
    private int visitCount;
    /**
     * visit_count
     */
    private int createAt;

    public TopicItem(String id, String authorId, String tab, String content, String title, Date lastReplyAt, boolean good, boolean top, int replyCount, int visitCount, int createAt) {
        this.id = id;
        this.authorId = authorId;
        this.tab = tab;
        this.content = content;
        this.title = title;
        this.lastReplyAt = lastReplyAt;
        this.good = good;
        this.top = top;
        this.replyCount = replyCount;
        this.visitCount = visitCount;
        this.createAt = createAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getLastReplyAt() {
        return lastReplyAt;
    }

    public void setLastReplyAt(Date lastReplyAt) {
        this.lastReplyAt = lastReplyAt;
    }

    public boolean isGood() {
        return good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    public boolean isTop() {
        return top;
    }

    public void setTop(boolean top) {
        this.top = top;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public int getCreateAt() {
        return createAt;
    }

    public void setCreateAt(int createAt) {
        this.createAt = createAt;
    }
}
    