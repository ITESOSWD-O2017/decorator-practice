package com.mycompany.Memberships.Benefits;
import com.mycompany.Memberships.BenefitsMembership;
import com.mycompany.Membership;

/**
 * Class accesToShowers.
 */
public class AccessToShowers extends BenefitsMembership {
    /**
     * towels.
     */
    private Membership showers;

    /**
     * default constructor.
     * @param shower a.
     */
    public AccessToShowers(final Membership shower) {
        this.showers = shower;
    }

    /**
     * a.
     * @return membership.
     */
    public final String getMembership() {
        if (this.showers != null) {
            return this.showers.getMembership();
        } else {
            return "Add your membership type";
        }
    }
}
