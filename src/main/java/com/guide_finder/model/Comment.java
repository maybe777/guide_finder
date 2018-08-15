package com.guide_finder.model;

/**
 * Created by Dmitry on 15.08.2018.
 */
public class Comment {

    private long date;
    private String content;
    private boolean isLike;

    public Comment(long date, String content, boolean isLike) {
        this.date = date;
        this.content = content;
        this.isLike = isLike;
    }

    public long getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public boolean isLike() {
        return isLike;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLike(boolean like) {
        isLike = like;
    }
}
