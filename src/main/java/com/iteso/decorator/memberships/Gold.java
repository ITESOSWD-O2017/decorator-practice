package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public class Gold extends Membership {

    /** Membership cost. */
    static final double MEMBERSHIP_COST = 20.0;

    /** constructor. */
    public Gold() {
    }

    /** @return String. */
    public final String getDescription() {
        return "Gold membership";
    }

    /** @return double*/
    public final double cost() {
        return MEMBERSHIP_COST;
    }
}
