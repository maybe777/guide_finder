package com.guide_finder.model;


/**
 * Created by Dmitry on 15.08.2018.
 */
public class SocialSummary {

    private String vkontakte;
    private String facebook;

    public SocialSummary(String vk, String fb) {
        this.vkontakte = vk;
        this.facebook = fb;
    }

    public void setVk(String vk) {

        this.vkontakte = vk;
    }

    public void setFb(String fb) {
        this.facebook = fb;
    }

    public String getVk() {

        return vkontakte;
    }

    public String getFb() {
        return facebook;
    }
}
