package com.iteso.Memberships.Benefits;

import com.iteso.Membership;
import com.iteso.Memberships.BenefitsClass;

/**
 * Two months of GOT free.
 */
public class TwoMonthGOT extends BenefitsClass {
    /**
     * Membership param.
     */
    private Membership moviesMembership;

    /**
     * Constructor.
     * @param membership receives a membership.
     */
    public TwoMonthGOT(final Membership membership) {
        this.moviesMembership = membership;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.moviesMembership != null) {
            return this.moviesMembership.getProperties() + " two months "
                    + "of game Of thrones,";
        } else {
            return "Please instantiate a membership.";
        }
    }

}
