package com.mycompany.Memberships.Benefits;
import com.mycompany.Memberships.BenefitsMembership;
import com.mycompany.Membership;

/**
 * Class Monthly Massage.
 */
public class MonthlyMassage extends BenefitsMembership {
    /**
     * massage.
     */
    private Membership massage;

    /**
     * default constructor.
     * @param massages a.
     */
    public MonthlyMassage(final Membership massages) {
        this.massage = massages;
    }

    /**
     * a.
     * @return memberhsip.
     */
    public final String getMembership() {
        if (this.massage != null) {
            return this.massage.getMembership() + ", monthly massage.";
        } else {
            return "Add your membership type";
        }
    }
}
