package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public class Silver extends Membership {

    /** Membership cost. */
    static final double MEMBERSHIP_COST = 15.0;

    /** constructor. */
    public Silver() {
    }

    /** @return String. */
    public final String getDescription() {
        return "Silver membership";
    }

    /** @return double*/
    public final double cost() {
        return MEMBERSHIP_COST;
    }
}
