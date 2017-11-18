package com.iteso.Memberships.Benefits;
import com.iteso.Membership;
import com.iteso.Memberships.BenefitsClass;

/**
 * Unlimited movies per month.
 */
public class FreeMoviesUnlimited extends BenefitsClass {
    /**
     * Membership param.
     */
    private Membership moviesMembership;

    /**
     * Constructor.
     * @param membership receives a membership.
     */
    public FreeMoviesUnlimited(final Membership membership) {
        this.moviesMembership = membership;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.moviesMembership != null) {
            return this.moviesMembership.getProperties()
                    + " free unlimited movies,";
        } else {
            return "Please instantiate a membership.";
        }
    }

}
