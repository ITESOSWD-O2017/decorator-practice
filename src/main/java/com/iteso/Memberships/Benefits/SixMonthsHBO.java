package com.iteso.Memberships.Benefits;

import com.iteso.Memberships.BenefitsClass;
import com.iteso.User;

/**
 * Six months free HBO access through your laptop.
 */
public class SixMonthsHBO extends BenefitsClass {
    /**
     * User param.
     */
    private User moviesUser;

    /**
     * Constructor.
     * @param user receives a user.
     */
    public SixMonthsHBO(final User user) {
        this.moviesUser = user;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.moviesUser != null) {
            return this.moviesUser.getProperties() + " six months HBO free,";
        } else {
            return "Please instantiate a membership.";
        }

    }
}
