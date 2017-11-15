package com.iteso.Memberships.Benefits;
import com.iteso.Memberships.BenefitsClass;
import com.iteso.User;
/**
 * Unlimited movies per month.
 */
public class FreeMoviesUnlimited extends BenefitsClass {
    /**
     * User param.
     */
    private User moviesUser;

    /**
     * Constructor.
     * @param user receives a user.
     */
    public FreeMoviesUnlimited(final User user) {
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
