package com.iteso.Memberships;
import com.iteso.Membership;

/**
 * Normal subscription.
 */
public class Normal extends Membership {

    /**
     * Constructor.
     */
    public Normal() {
        setProperty("Normal membership,");
    }

    @Override
    public final String getProperties() {
        return sendProperty();
    }
}


