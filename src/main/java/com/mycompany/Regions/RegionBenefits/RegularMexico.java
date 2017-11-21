package com.mycompany.Regions.RegionBenefits;
import com.mycompany.Membership;
import com.mycompany.Memberships.Regular;
import com.mycompany.Memberships.Benefits.FreeUseOfTowels;

/**
 * Class Mexico.
 */
public class RegularMexico extends Membership {
    /**
     * membership.
     */
    private Membership membership;

    /**
     * a.
     * @return membership.
     */
    public final String getMembership() {
        return "Mexico " + this.membership.getMembership();
    }

    /**
     * default constructor.
     * @param memberships s.
     */
    public RegularMexico(final Membership memberships) {
        this.membership = memberships;
        this.membership = new Regular();
        this.membership = new FreeUseOfTowels(membership);
    }
}
