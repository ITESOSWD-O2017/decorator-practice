package com.iteso.Memberships.Benefits;
import com.iteso.Memberships.BenefitsClass;
import com.iteso.Membership;

/**.
 * Class unlimited
 */
public class UnlimitedDownloads extends BenefitsClass {

    /**
     * Membership param.
     */
    private Membership unlimitedMembership;
    /**
     * Constructor.
     * @param membership receives a membership.
     */
    public UnlimitedDownloads(final Membership membership) {

        this.unlimitedMembership = membership;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.unlimitedMembership != null) {
            return this.unlimitedMembership.getProperties()
                    + " unlimited downloads,";
        } else {
            return "Please instantiate a membership.";
        }
    }
}
