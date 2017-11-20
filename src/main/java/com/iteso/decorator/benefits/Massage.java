package com.iteso.decorator.benefits;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public class Massage extends Benefits {
    /** membership. */
    private Membership membership;

    /** massageCost. */
    private double massageCost = 0;

    /** @return Membership */
    public final Membership getMembership() {
        return membership;
    }

    /** @param m */
    public Massage(final Membership m) {
        this.membership = m;
    }

    /** @return String */
    public final String getDescription() {
        return membership.getDescription() + " with massages";
    }

    /** @return double*/
    public final double cost() {
        return membership.cost() + massageCost;
    }
}
