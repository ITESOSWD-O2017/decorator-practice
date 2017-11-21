package com.iteso.Factories.FactoriesBenefits;
import com.iteso.Membership;
import com.iteso.Memberships.Benefits.MorePlaylists;
import com.iteso.Memberships.BronceMembership;

/**.
 * Class USA
 */
public class BronceUSA extends Membership {

    /**
     * Membership attribute.*/
    private Membership membership;

    @Override
    public final String getProperties() {
        if (this.membership.getProperties() == null) {
            return  "Please assign a membership";
        } else {
            return "MEX " + this.membership.getProperties();
        }
    }
    /**
     * Constructor.
     * @param m membership.*/
    public BronceUSA(final Membership m) {
        this.membership = m;
        this.membership = new BronceMembership();
        this.membership = new MorePlaylists(membership);
    }
}
