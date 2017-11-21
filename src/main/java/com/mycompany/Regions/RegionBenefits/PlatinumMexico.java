package com.mycompany.Regions.RegionBenefits;
import com.mycompany.Membership;
import com.mycompany.Memberships.Benefits.AccessToShowers;
import com.mycompany.Memberships.Benefits.FreeParking;
import com.mycompany.Memberships.Benefits.AccessToSteam;
import com.mycompany.Memberships.Benefits.FreeUseOfTowels;
import com.mycompany.Memberships.Benefits.UseOfLocker;
import com.mycompany.Memberships.Platinum;

/**
 * Class Platinum.
 */
public class PlatinumMexico extends Membership {
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
    public PlatinumMexico(final Membership memberships) {
        this.membership = memberships;
        this.membership = new Platinum();
        this.membership = new FreeUseOfTowels(membership);
        this.membership = new UseOfLocker(membership);
        this.membership = new FreeParking(membership);
        this.membership = new AccessToShowers(membership);
        this.membership = new AccessToSteam(membership);
    }
}
