package com.guide_finder.model.user;

import com.guide_finder.model.*;
import com.guide_finder.model.user.User;

import java.util.List;
import java.util.Set;

/**
 * Created by Dmitry on 15.08.2018.
 */
public class Guide extends User {

    private Set<Language> languages;
    private List<Comment> comments;
    private Set<Category> categories;
    private boolean isActive;
    private String description;
    private int likeCount;
    private SocialSummary socialSummary;

}
