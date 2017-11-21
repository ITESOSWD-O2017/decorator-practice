package com.iteso.Memberships.Benefits;
import com.iteso.Membership;
import com.iteso.Memberships.BenefitsClass;

/**.
 * Class share
 */
public class ShareSongs extends BenefitsClass {

    /**
     * Membership param.
     */
    private Membership shareMembership;
    /**
     * Constructor.
     * @param membership receives a membership.
     */
    public ShareSongs(final Membership membership) {
        this.shareMembership = membership;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.shareMembership != null) {
            return this.shareMembership.getProperties()
                    + " share songs,";
        } else {
            return "Please instantiate a membership.";
        }
    }
}
