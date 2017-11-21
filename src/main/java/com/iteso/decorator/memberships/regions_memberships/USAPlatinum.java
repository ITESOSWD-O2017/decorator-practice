package com.iteso.decorator.memberships.regions_memberships;

import com.iteso.decorator.Membership;
import com.iteso.decorator.benefits.Discount;
import com.iteso.decorator.benefits.Locker;
import com.iteso.decorator.benefits.Partner;
import com.iteso.decorator.benefits.Steam;
import com.iteso.decorator.benefits.TanningBed;
import com.iteso.decorator.benefits.Massage;
import com.iteso.decorator.benefits.lessons.Yoga;
import com.iteso.decorator.benefits.lessons.Zumba;
import com.iteso.decorator.memberships.Platinum;

/**
 * Created by AlejandraSahagun on 20/11/17.
 */
public class USAPlatinum extends Membership {

    /** Membership cost. */
    static final double MEMBERSHIP_COST = 25.0;

    /** membership. */
    private Membership membership;

    /**
     * Constructor.
     * @param m membership.
     **/
    public USAPlatinum(final Membership m) {
        this.membership = m;
        this.membership = new Platinum();
        this.membership = new Locker(membership);
        this.membership = new Discount(membership);
        this.membership = new Partner(membership);
        this.membership = new Steam(membership);
        this.membership = new Yoga(membership);
        this.membership = new Zumba(membership);
        this.membership = new TanningBed(membership);
        this.membership = new Massage(membership);
    }

    /** @return String. */
    public final String getDescription() {
        return "American Platinum membership";
    }

    /** @return double*/
    public final double cost() {
        return MEMBERSHIP_COST;
    }
}
