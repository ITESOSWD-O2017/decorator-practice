package com.iteso.Memberships.Benefits;
import com.iteso.Memberships.BenefitsClass;
import com.iteso.User;

/**
 * Unlimited access to all series.
 */
public class UnlimitedSeries extends BenefitsClass {
    /**
     * User param.
     */
    private User moviesUser;
    /**
     * @param user receives a user.
     */
    public UnlimitedSeries(final User user) {
        this.moviesUser = user;
    }

    /**
     * Getting property.
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.moviesUser != null) {
            return this.moviesUser.getProperties() + " unlimited series,";
        } else {
            return "Please instantiate a membership.";
        }
    }
}

