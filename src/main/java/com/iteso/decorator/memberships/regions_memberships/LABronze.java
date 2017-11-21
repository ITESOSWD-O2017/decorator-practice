package com.iteso.decorator.memberships.regions_memberships;

import com.iteso.decorator.Membership;
import com.iteso.decorator.benefits.Locker;
import com.iteso.decorator.memberships.Bronze;

/**
 * Created by AlejandraSahagun on 20/11/17.
 */
public class LABronze extends Membership {

    /** Membership cost. */
    static final double MEMBERSHIP_COST = 10.0;

    /** membership. */
    private Membership membership;

    /**
     * Constructor.
     * @param m membership.*/
    public LABronze(final Membership m) {
        this.membership = m;
        this.membership = new Bronze();
        this.membership = new Locker(membership);
    }

    /** @return String. */
    public final String getDescription() {
        return "Latin American Bronze membership";
    }

    /** @return double*/
    public final double cost() {
        return MEMBERSHIP_COST;
    }
}

