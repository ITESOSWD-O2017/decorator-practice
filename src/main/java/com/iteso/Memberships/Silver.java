package com.iteso.Memberships;
import com.iteso.User;

/**
 * Silver subscription.
 */
public class Silver extends User {
    /**
     * Constructor.
     */
    public Silver() {
        setProperty("Silver membership,");
    }

    @Override
    public final String getProperties() {
        return sendProperty();
    }
}
