package com.mycompany.Regions.RegionBenefits;
import com.mycompany.Membership;
import com.mycompany.Memberships.Benefits.FreeUseOfTowels;
import com.mycompany.Memberships.Benefits.UseOfLocker;
import com.mycompany.Memberships.Silver;

/**
 * class USA.
 */
public class SilverUSA extends Membership {
    /**
     * membership.
     */
    private Membership membership;

    /**
     * a.
     * @return membership.
     */
    public final String getMembership() {
        return "USA " + this.membership.getMembership();
    }

    /**
     * default constructor.
     * @param memberships s.
     */
    public SilverUSA(final Membership memberships) {
        this.membership = memberships;
        this.membership = new Silver();
        this.membership = new FreeUseOfTowels(membership);
        this.membership = new UseOfLocker(membership);
    }
}
