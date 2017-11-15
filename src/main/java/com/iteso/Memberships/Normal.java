package com.iteso.Memberships;
import com.iteso.User;

/**
 * Normal subscription.
 */
public class Normal extends User {

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


