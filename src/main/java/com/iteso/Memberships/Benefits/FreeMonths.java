package com.iteso.Memberships.Benefits;
import com.iteso.Memberships.BenefitsClass;
import com.iteso.Membership;

/**.
 * Class free
 */
public class FreeMonths extends BenefitsClass {

    /**
     * Membership param.
     */
    private Membership freeMembership;
    /**
     * Constructor.
     * @param membership receives a membership.
     */
    public FreeMonths(final Membership membership) {

        this.freeMembership = membership;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.freeMembership != null) {
            return this.freeMembership.getProperties()
                    + " free months,";
        } else {
            return "Please instantiate a membership.";
        }
    }
}
