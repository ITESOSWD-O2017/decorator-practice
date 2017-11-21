package com.iteso.Memberships.Benefits;
import com.iteso.Membership;
import com.iteso.Memberships.BenefitsClass;

/**.
 * Songs
 */
public class SongsStoraged extends BenefitsClass {

    /**
     * Membership param.
     */
    private Membership songsMembership;
    /**
     * Constructor.
     * @param membership receives a membership.
     */
    public SongsStoraged(final Membership membership) {
        this.songsMembership = membership;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.songsMembership != null) {
            return this.songsMembership.getProperties()
                    + " songs storaged,";
        } else {
            return "Please instantiate a membership.";
        }
    }

}
