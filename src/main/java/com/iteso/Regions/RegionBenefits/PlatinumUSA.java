package com.iteso.Regions.RegionBenefits;
import com.iteso.Membership;
import com.iteso.Memberships.Benefits.FreeDocumentaries;
import com.iteso.Memberships.Benefits.FreeMoviesUnlimited;
import com.iteso.Memberships.Benefits.OneYearSubscription;
import com.iteso.Memberships.Benefits.SixMonthsHBO;
import com.iteso.Memberships.Platinum;

/**
 * Netflix  Platinum LA abstract class.
 */
public class PlatinumUSA extends Membership {
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
    public PlatinumUSA(final Membership m) {
        this.membership = m;
        this.membership = new Platinum();
        this.membership = new SixMonthsHBO(membership);
        this.membership = new FreeDocumentaries(membership);
        this.membership = new FreeMoviesUnlimited(membership);
        this.membership = new OneYearSubscription(membership);
    }

}
