package com.iteso.Memberships.Benefits;

import com.iteso.Memberships.BenefitsClass;
import com.iteso.User;

/**
 * Two months of GOT free.
 */
public class TwoMonthGOT extends BenefitsClass {
    /**
     * User param.
     */
    private User moviesUser;

    /**
     * Constructor.
     * @param user receives a user.
     */
    public TwoMonthGOT(final User user) {
        this.moviesUser = user;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.moviesUser != null) {
            return this.moviesUser.getProperties() + " two months "
                    + "of game Of thrones,";
        } else {
            return "Please instantiate a membership.";
        }
    }

}
