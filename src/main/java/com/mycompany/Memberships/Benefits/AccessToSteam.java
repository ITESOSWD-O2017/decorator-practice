package com.mycompany.Memberships.Benefits;
import com.mycompany.Memberships.BenefitsMembership;
import com.mycompany.Membership;

/**
 * Class Steam.
 */
public class AccessToSteam extends BenefitsMembership {
    /**
     * towels.
     */
    private Membership steam;

    /**
     * default constructor.
     * @param steams a.
     */
    public AccessToSteam(final Membership steams) {
        this.steam = steams;
    }

    /**
     * a.
     * @return membership.
     */
    public final String getMembership() {
        if (this.steam != null) {
            return this.steam.getMembership();
        } else {
            return "Add your membership type";
        }
    }
}
