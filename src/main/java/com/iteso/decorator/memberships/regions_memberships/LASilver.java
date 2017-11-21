package com.iteso.decorator.memberships.regions_memberships;

import com.iteso.decorator.Membership;
import com.iteso.decorator.benefits.Locker;
import com.iteso.decorator.benefits.Steam;
import com.iteso.decorator.benefits.lessons.Yoga;
import com.iteso.decorator.benefits.lessons.Zumba;
import com.iteso.decorator.memberships.Silver;

/**
 * Created by AlejandraSahagun on 20/11/17.
 */
public class LASilver extends Membership {

    /** Membership cost. */
    static final double MEMBERSHIP_COST = 15.0;

    /** membership. */
    private Membership membership;

    /**
     * Constructor.
     * @param m membership.*/
    public LASilver(final Membership m) {
        this.membership = m;
        this.membership = new Silver();
        this.membership = new Locker(membership);
        this.membership = new Steam(membership);
        this.membership = new Yoga(membership);
        this.membership = new Zumba(membership);
    }

    /** @return String. */
    public final String getDescription() {
        return "Latin American Silver membership";
    }

    /** @return double*/
    public final double cost() {
        return MEMBERSHIP_COST;
    }
}
