package com.iteso.Regions.RegionBenefits;
import com.iteso.Membership;
import com.iteso.Memberships.Benefits.FreeDocumentaries;
import com.iteso.Memberships.Benefits.FreeMoviesUnlimited;
import com.iteso.Memberships.Benefits.SixMonthsHBO;
import com.iteso.Memberships.Gold;

/**
 * Netflix Gold LA abstract class.
 */
public class GoldUSA extends Membership {
    /**
     * Membership attribute.*/
    private Membership membership;

    @Override
    public final String getProperties() {
        if (this.membership.getProperties() == null) {
            return  "Please assign a membership";
        } else {
            return "USA " + this.membership.getProperties();
        }
    }
    /**
     * Constructor.
     * @param m membership.*/
    public GoldUSA(final Membership m) {
        this.membership = m;
        this.membership = new Gold();
        this.membership = new SixMonthsHBO(membership);
        this.membership = new FreeMoviesUnlimited(membership);
        this.membership = new FreeDocumentaries(membership);
    }

}
