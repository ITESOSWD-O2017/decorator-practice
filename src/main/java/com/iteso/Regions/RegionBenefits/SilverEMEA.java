package com.iteso.Regions.RegionBenefits;
import com.iteso.Membership;
import com.iteso.Memberships.Benefits.FreeDocumentaries;
import com.iteso.Memberships.Benefits.FreeMoviesFifteenPerMonth;
import com.iteso.Memberships.Benefits.TwoMonthGOT;
import com.iteso.Memberships.Silver;

/**
 * Netflix Normal EMEA abstract class.
 */
public class SilverEMEA extends Membership {
    /**
     * Membership attribute.*/
    private Membership membership;

    @Override
    public final String getProperties() {
        if (this.membership.getProperties() == null) {
            return  "Please assign a membership";
        } else {
            return "EMEA " + this.membership.getProperties();
        }
    }
    /**
     * Constructor.
     * @param m membership.*/
    public SilverEMEA(final Membership m) {
        this.membership = m;
        this.membership = new Silver();
        this.membership = new TwoMonthGOT(membership);
        this.membership = new FreeDocumentaries(membership);
        this.membership = new FreeMoviesFifteenPerMonth(membership);
    }

}
