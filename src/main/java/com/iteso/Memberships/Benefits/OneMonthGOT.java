package com.iteso.Memberships.Benefits;
import com.iteso.Memberships.BenefitsClass;
import com.iteso.Membership;

/**
 * One month full access to HBO episodes.
 */
public class OneMonthGOT extends BenefitsClass {

    /**
     * Membership param.
     */
    private Membership moviesMembership;
    /**
     * Constructor.
     * @param membership receives a membership.
     */
    public OneMonthGOT(final Membership membership) {
        this.moviesMembership = membership;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.moviesMembership != null) {
            return this.moviesMembership.getProperties() + " one month of "
                    + "game Of thrones,";
        } else {
            return "Please instantiate a membership.";
        }
    }
}

