package com.iteso.Memberships.Benefits;

import com.iteso.Memberships.BenefitsClass;
import com.iteso.Membership;

/**
 * Six months free HBO access through your laptop.
 */
public class SixMonthsHBO extends BenefitsClass {
    /**
     * Membership param.
     */
    private Membership moviesMembership;

    /**
     * Constructor.
     * @param membership receives a membership.
     */
    public SixMonthsHBO(final Membership membership) {
        this.moviesMembership = membership;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.moviesMembership != null) {
            return this.moviesMembership.getProperties()
                    + " six months HBO free,";
        } else {
            return "Please instantiate a membership.";
        }

    }
}
