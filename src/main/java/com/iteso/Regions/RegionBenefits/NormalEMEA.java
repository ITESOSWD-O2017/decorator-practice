package com.iteso.Regions.RegionBenefits;
import com.iteso.Membership;
import com.iteso.Memberships.Benefits.FreeDocumentaries;
import com.iteso.Memberships.Benefits.TwoMonthGOT;
import com.iteso.Memberships.Normal;

/**
 * Netflix Normal LA abstract class.
 */
public class NormalEMEA extends Membership {
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
    public NormalEMEA(final Membership m) {
        this.membership = m;
        this.membership = new Normal();
        this.membership = new TwoMonthGOT(membership);
        this.membership = new FreeDocumentaries(membership);
    }

}
