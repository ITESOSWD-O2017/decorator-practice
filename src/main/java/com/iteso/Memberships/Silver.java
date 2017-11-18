package com.iteso.Memberships;
import com.iteso.Membership;

/**
 * Silver subscription.
 */
public class Silver extends Membership {
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
