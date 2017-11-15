package com.iteso.Memberships;
import com.iteso.User;

/**
 * Gold subscription.
 */
public class Gold extends User {
    /**
     * Constructor.
     */
    public Gold() {
        setProperty("Gold membership,");
    }

    @Override
    public final String getProperties() {
        return sendProperty();
    }
}
