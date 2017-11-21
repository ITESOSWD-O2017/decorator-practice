package com.mycompany.Memberships.Benefits;
import com.mycompany.Memberships.BenefitsMembership;
import com.mycompany.Membership;

/**
 * Class Locker.
 */
public class UseOfLocker extends BenefitsMembership {
    /**
     * locker.
     */
    private Membership locker;

    /**
     * default constructor.
     * @param lockers a.
     */
    public UseOfLocker(final Membership lockers) {
        this.locker = lockers;
    }

    /**
     * a.
     * @return memberhsip.
     */
    public final String getMembership() {
        if (this.locker != null) {
            return this.locker.getMembership() + ", free locker.";
        } else {
            return "Add your membership type";
        }
    }
}
