package com.iteso.Regions.RegionBenefits;
import com.iteso.Membership;
import com.iteso.Memberships.Benefits.FreeDocumentaries;
import com.iteso.Memberships.Benefits.FreeMoviesFifteenPerMonth;
import com.iteso.Memberships.Benefits.TwoMonthGOT;
import com.iteso.Memberships.Benefits.UnlimitedSeries;
import com.iteso.Memberships.Benefits.OneYearSubscription;
import com.iteso.Memberships.Platinum;

/**
 * Netflix Platinum EMEA abstract class.
 */
public class PlatinumEMEA extends Membership {
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
    public PlatinumEMEA(final Membership m) {
        this.membership = m;
        this.membership = new Platinum();
        this.membership = new TwoMonthGOT(membership);
        this.membership = new FreeDocumentaries(membership);
        this.membership = new FreeMoviesFifteenPerMonth(membership);
        this.membership = new UnlimitedSeries(membership);
        this.membership = new OneYearSubscription(membership);
    }

}
