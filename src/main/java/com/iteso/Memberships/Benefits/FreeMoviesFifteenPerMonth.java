package com.iteso.Memberships.Benefits;
import com.iteso.Membership;
import com.iteso.Memberships.BenefitsClass;

/**
 * 15 free movies per month.
 */
public class FreeMoviesFifteenPerMonth extends BenefitsClass {

    /**
     * Membership param.
     */
    private Membership moviesMembership;

    /**
     * Constructor.
     * @param membership receives a membership.
     */
    public FreeMoviesFifteenPerMonth(final Membership membership) {
        this.moviesMembership = membership;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.moviesMembership != null) {
            return this.moviesMembership.getProperties()
                    + " free 15 movies per month,";
        } else {
            return "Please instantiate a membership.";
        }
    }

}
