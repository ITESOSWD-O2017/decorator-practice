package com.mycompany.Regions.RegionBenefits;
import com.mycompany.Membership;
import com.mycompany.Memberships.Benefits.AccessToShowers;
import com.mycompany.Memberships.Benefits.FreeParking;
import com.mycompany.Memberships.Benefits.UseOfLocker;
import com.mycompany.Memberships.Gold;
import com.mycompany.Memberships.Benefits.FreeUseOfTowels;

/**
 * Class gold.
 */
public class GoldMexico extends Membership {
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
    public GoldMexico(final Membership memberships) {
        this.membership = memberships;
        this.membership = new Gold();
        this.membership = new FreeUseOfTowels(membership);
        this.membership = new UseOfLocker(membership);
        this.membership = new FreeParking(membership);
        this.membership = new AccessToShowers(membership);
    }
}
