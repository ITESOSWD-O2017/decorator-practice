package com.iteso.Memberships;
import com.iteso.Membership;

/**
 * Platinum subscription.
 */
public class Platinum extends Membership {
    /**
     * Constructor.
     */
    public Platinum() {
       setProperty("Platinum membership,");
    }

    @Override
    public final String getProperties() {
        return sendProperty();
    }
}
