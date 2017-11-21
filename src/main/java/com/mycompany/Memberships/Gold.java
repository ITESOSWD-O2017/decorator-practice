package com.mycompany.Memberships;
import com.mycompany.Membership;

/**
 * Gold membership.
 */
public class Gold extends Membership {
    /**
     * default constructor.
     */
    public Gold() {
        setMembership("Gold membership");
    }

    @Override
    public final String getMembership() {
        return sendMembership();
    }
}
