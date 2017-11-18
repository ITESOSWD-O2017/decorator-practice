package com.iteso.Regions.RegionBenefits;
import com.iteso.Membership;
import com.iteso.Memberships.Benefits.FreeDocumentaries;
import com.iteso.Memberships.Benefits.OneMonthGOT;
import com.iteso.Memberships.Gold;

/**
 * Netflix Gold LA abstract class.
 */
public class GoldLATAM extends Membership {
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
    public GoldLATAM(final Membership m) {
       this.membership = m;
       this.membership = new Gold();
       this.membership = new OneMonthGOT(membership);
       this.membership = new FreeDocumentaries(membership);
    }
}
