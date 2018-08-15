package com.guide_finder.model;

import com.guide_finder.enums.Levels;
import com.guide_finder.model.user.Guide;

import java.util.Set;

/**
 * Created by Dmitry on 15.08.2018.
 */
public class Language {

    private Set<Guide> guides;
    private Language name;
    private Levels levels;

    public Language getName() {
        return name;
    }

    public void setName(Language name) {
        this.name = name;
    }

    public Levels getLevels() {
        return levels;
    }

    public void setLevels(Levels levels) {
        this.levels = levels;
    }

    public Language(Set<Guide> guides, Language language, Levels levels) {
        this.guides = guides;
        this.name = language;
        this.levels = levels;
    }

    public void setGuides(Set<Guide> guides) {

        this.guides = guides;
    }

    public Set<Guide> getGuides() {

        return guides;
    }
}
