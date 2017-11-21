package com.mycompany.Memberships;
import com.mycompany.Membership;

/**
 * Regular membership.
 */
public class Regular extends Membership {
    /**
     * default constructor.
     */
    public Regular() {
        setMembership("Regular membership");
    }

    /**
     * a.
     * @return membership.
     */
    public final String getMembership() {
        return sendMembership();
    }
}
