package com.iteso.Memberships.Benefits;
import com.iteso.Memberships.BenefitsClass;
import com.iteso.Membership;

/**.
 * Class nowifi
 */
public class NoWifiNeeded extends BenefitsClass {

    /**
     * Membership param.
     */
    private Membership wifiMembership;
    /**
     * Constructor.
     * @param membership receives a membership.
     */
    public NoWifiNeeded(final Membership membership) {

        this.wifiMembership = membership;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.wifiMembership != null) {
            return this.wifiMembership.getProperties()
                    + " no wifi is needed,";
        } else {
            return "Please instantiate a membership.";
        }
    }
}
