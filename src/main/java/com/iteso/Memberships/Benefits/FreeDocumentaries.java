package com.iteso.Memberships.Benefits;

import com.iteso.Memberships.BenefitsClass;
import com.iteso.User;

/**
 * Access to all documentaries.
 */
public class FreeDocumentaries extends BenefitsClass {
    /**
     * User param.
     */
    private User moviesUser;
    /**
     * Constructor.
     * @param user receives a user.
     */
    public FreeDocumentaries(final User user) {
        this.moviesUser = user;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.moviesUser != null) {
            return this.moviesUser.getProperties() + " free unlimited movies,";
        } else {
            return "Please instantiate a membership.";
        }
    }
}

