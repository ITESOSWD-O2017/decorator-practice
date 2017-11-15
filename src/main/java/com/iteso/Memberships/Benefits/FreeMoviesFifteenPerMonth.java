package com.iteso.Memberships.Benefits;
import com.iteso.Memberships.BenefitsClass;
import com.iteso.User;

/**
 * 15 free movies per month.
 */
public class FreeMoviesFifteenPerMonth extends BenefitsClass {

    /**
     * User param.
     */
    private User moviesUser;

    /**
     * Constructor.
     * @param user receives a user.
     */
    public FreeMoviesFifteenPerMonth(final User user) {
        this.moviesUser = user;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.moviesUser != null) {
            return this.moviesUser.getProperties()
                    + " free 15 movies per month,";
        } else {
            return "Please instantiate a membership.";
        }
    }

}
