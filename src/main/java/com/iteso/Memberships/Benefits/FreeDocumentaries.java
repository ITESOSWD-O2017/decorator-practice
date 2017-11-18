package com.iteso.Memberships.Benefits;

import com.iteso.Memberships.BenefitsClass;
import com.iteso.Membership;

/**
 * Access to all documentaries.
 */
public class FreeDocumentaries extends BenefitsClass {
    /**
     * Membership param.
     */
    private Membership moviesMembership;
    /**
     * Constructor.
     * @param membership receives a membership.
     */
    public FreeDocumentaries(final Membership membership) {
        this.moviesMembership = membership;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.moviesMembership != null) {
            return this.moviesMembership.getProperties()
                    + " free documentaries,";
        } else {
            return "Please instantiate a membership.";
        }
    }
}

