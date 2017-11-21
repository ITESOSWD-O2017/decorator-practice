package com.mycompany.Memberships;
import com.mycompany.Membership;

/**
 * Platinum membership.
 */
public class Platinum extends Membership {
    /**
     * default constructor.
     */
    public Platinum() {
        setMembership("Platinum membership");
    }

    @Override
    public final String getMembership() {
        return sendMembership();
    }
}
