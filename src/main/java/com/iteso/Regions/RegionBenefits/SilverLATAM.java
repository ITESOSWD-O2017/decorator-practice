package com.iteso.Regions.RegionBenefits;
import com.iteso.Membership;
import com.iteso.Memberships.Benefits.FreeMoviesFifteenPerMonth;
import com.iteso.Memberships.Benefits.OneMonthGOT;
import com.iteso.Memberships.Silver;

/**
 * Netflix Silver LA abstract class.
 */
public class SilverLATAM extends Membership {
    /**
     * Membership attribute.*/
    private Membership membership;

    @Override
    public final String getProperties() {
        if (this.membership.getProperties() == null) {
            return  "Please assign a membership";
        } else {
            return "LA " + this.membership.getProperties();
        }
    }
    /**
     * Constructor.
     * @param m membership.*/
    public SilverLATAM(final Membership m) {
        this.membership = m;
        this.membership = new Silver();
        this.membership = new OneMonthGOT(membership);
        this.membership = new FreeMoviesFifteenPerMonth(membership);
    }

}
