package com.iteso.Memberships;
import com.iteso.Membership;

/**
 * Gold subscription.
 */
public class Gold extends Membership {
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
