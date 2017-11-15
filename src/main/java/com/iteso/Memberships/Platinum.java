package com.iteso.Memberships;
import com.iteso.User;

/**
 * Platinum subscription.
 */
public class Platinum extends User {
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
