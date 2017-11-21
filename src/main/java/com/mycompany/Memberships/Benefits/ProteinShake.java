package com.mycompany.Memberships.Benefits;
import com.mycompany.Memberships.BenefitsMembership;
import com.mycompany.Membership;

/**
 * class Protein shake.
 */
public class ProteinShake extends BenefitsMembership {
    /**
     * shake.
     */
    private Membership shake;

    /**
     * default constructor.
     * @param shakes a.
     */
    public ProteinShake(final Membership shakes) {
        this.shake = shakes;
    }

    /**
     * a.
     * @return membership.
     */
    public final String getMembership() {
        if (this.shake != null) {
            return this.shake.getMembership() + ", free monthly protein shake.";
        } else {
            return "Add your membership type";
        }
    }
}
