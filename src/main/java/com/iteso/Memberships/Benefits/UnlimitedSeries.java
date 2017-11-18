package com.iteso.Memberships.Benefits;
import com.iteso.Membership;
import com.iteso.Memberships.BenefitsClass;

/**
 * Unlimited access to all series.
 */
public class UnlimitedSeries extends BenefitsClass {
    /**
     * Membership param.
     */
    private Membership moviesMembership;
    /**
     * @param membership receives a membership.
     */
    public UnlimitedSeries(final Membership membership) {
        this.moviesMembership = membership;
    }

    /**
     * Getting property.
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.moviesMembership != null) {
            return this.moviesMembership.getProperties() + " unlimited series,";
        } else {
            return "Please instantiate a membership.";
        }
    }
}

