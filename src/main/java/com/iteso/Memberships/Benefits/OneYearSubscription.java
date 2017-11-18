package com.iteso.Memberships.Benefits;
import com.iteso.Membership;
import com.iteso.Memberships.BenefitsClass;

/**
 * Membership subscription for netflix one year.
 */
public class OneYearSubscription extends BenefitsClass {
    /**
     * Membership param.
     */
    private Membership moviesMembership;

    /**
     * Constructor.
     * @param membership receives a membership.
     */
    public OneYearSubscription(final Membership membership) {
        this.moviesMembership = membership;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.moviesMembership != null) {
            return this.moviesMembership.getProperties() + " netflix "
                    + "subscription for one year,";
        } else {
            return "Please instantiate a membership.";
        }
    }
}
