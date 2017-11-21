package com.mycompany.Regions.RegionBenefits;
import com.mycompany.Membership;
import com.mycompany.Memberships.Benefits.FreeUseOfTowels;
import com.mycompany.Memberships.Regular;

/**
 * Class USA.
 */
public class RegularUSA extends Membership {
    /**
     * membership.
     */
    private Membership membership;

    /**
     * s.
     * @return membership.
     */
    public final String getMembership() {
        return "USA " + this.membership.getMembership();
    }

    /**
     * default constructor.
     * @param memberships s.
     */
    public RegularUSA(final Membership memberships) {
        this.membership = memberships;
        this.membership = new Regular();
        this.membership = new FreeUseOfTowels(membership);
    }
}
