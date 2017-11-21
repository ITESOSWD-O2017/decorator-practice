package com.mycompany.Memberships;
import com.mycompany.Membership;

/**
 * Class Silver membership.
 */
public class Silver extends Membership {
    /**
     * default constructor.
     */
    public Silver() {
        setMembership("Silver membership");
    }

    /**
     * a.
     * @return memberhsip.
     */
    public final String getMembership() {
        return sendMembership();
    }
}
