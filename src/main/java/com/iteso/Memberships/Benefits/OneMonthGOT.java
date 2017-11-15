package com.iteso.Memberships.Benefits;
import com.iteso.Memberships.BenefitsClass;
import com.iteso.User;

/**
 * One month full access to HBO episodes.
 */
public class OneMonthGOT extends BenefitsClass {

    /**
     * User param.
     */
    private User moviesUser;
    /**
     * Constructor.
     * @param user receives a user.
     */
    public OneMonthGOT(final User user) {
        this.moviesUser = user;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.moviesUser != null) {
            return this.moviesUser.getProperties() + " one month of "
                    + "game Of thrones,";
        } else {
            return "Please instantiate a membership.";
        }
    }
}

