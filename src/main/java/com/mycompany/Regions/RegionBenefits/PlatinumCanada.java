package com.mycompany.Regions.RegionBenefits;
import com.mycompany.Membership;
import com.mycompany.Memberships.Benefits.AccessToShowers;
import com.mycompany.Memberships.Benefits.FreeParking;
import com.mycompany.Memberships.Benefits.AccessToSteam;
import com.mycompany.Memberships.Benefits.MonthlyMassage;
import com.mycompany.Memberships.Benefits.PersonalInstructor;
import com.mycompany.Memberships.Benefits.FreeUseOfTowels;
import com.mycompany.Memberships.Benefits.UseOfLocker;
import com.mycompany.Memberships.Platinum;

/**
 * Class Platinum.
 */
public class PlatinumCanada extends Membership {
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
    public PlatinumCanada(final Membership memberships) {
        this.membership = memberships;
        this.membership = new Platinum();
        this.membership = new FreeUseOfTowels(membership);
        this.membership = new UseOfLocker(membership);
        this.membership = new FreeParking(membership);
        this.membership = new AccessToShowers(membership);
        this.membership = new AccessToSteam(membership);
        this.membership = new MonthlyMassage(membership);
        this.membership = new PersonalInstructor(membership);
    }
}
