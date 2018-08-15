package com.guide_finder.model.user;

/**
 * Created by Dmitry on 15.08.2018.
 */
public class Staff extends User {

    private int fix_price;

    public void setFix_price(int fix_price) {
        this.fix_price = fix_price;
    }

    public int getFixPrice() {

        return fix_price;
    }

    public Staff(int fix_price) {
        this.fix_price = fix_price;
    }
}
