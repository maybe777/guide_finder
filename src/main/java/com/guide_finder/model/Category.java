package com.guide_finder.model;

import com.guide_finder.model.user.Guide;

import java.util.Set;

/**
 * Created by Dmitry on 15.08.2018.
 */
public class Category {

    private Set<Guide> guide;
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
