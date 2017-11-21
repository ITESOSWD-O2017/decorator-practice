package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public class Platinum extends Membership {

    /** Membership cost. */
    static final double MEMBERSHIP_COST = 25.0;

    /** constructor. */
    public Platinum() {
    }

    /** @return String. */
    public final String getDescription() {
        return "Platinum membership";
    }

    /** @return double*/
    public final double cost() {
        return MEMBERSHIP_COST;
    }
}
