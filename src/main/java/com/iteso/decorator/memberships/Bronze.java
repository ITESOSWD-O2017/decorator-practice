package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public class Bronze extends Membership {

    /** Membership cost. */
    static final double MEMBERSHIP_COST = 10.0;

    /** constructor. */
    public Bronze() {
    }

    /** @return String. */
    public final String getDescription() {
        return "Bronze membership";
    }

    /** @return double*/
    public final double cost() {
        return MEMBERSHIP_COST;
    }
}
