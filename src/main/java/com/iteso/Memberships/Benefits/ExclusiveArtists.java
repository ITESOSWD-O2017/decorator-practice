package com.iteso.Memberships.Benefits;
import com.iteso.Memberships.BenefitsClass;
import com.iteso.Membership;

/**.
 * Class artists
 */
public class ExclusiveArtists extends BenefitsClass {

    /**
     * Membership param.
     */
    private Membership artistMembership;
    /**
     * Constructor.
     * @param membership receives a membership.
     */
    public ExclusiveArtists(final Membership membership) {
        this.artistMembership = membership;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.artistMembership != null) {
            return this.artistMembership.getProperties()
                    + " exclusive artists,";
        } else {
            return "Please instantiate a membership.";
        }
    }
}
