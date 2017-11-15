package com.iteso.Memberships.Benefits;
import com.iteso.Memberships.BenefitsClass;
import com.iteso.User;

/**
 * User subscription for netflix one year.
 */
public class OneYearSubscription extends BenefitsClass {
    /**
     * User param.
     */
    private User moviesUser;

    /**
     * Constructor.
     * @param user receives a user.
     */
    public OneYearSubscription(final User user) {
        this.moviesUser = user;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.moviesUser != null) {
            return this.moviesUser.getProperties() + " netflix "
                    + "subscription for one year,";
        } else {
            return "Please instantiate a membership.";
        }
    }
}
