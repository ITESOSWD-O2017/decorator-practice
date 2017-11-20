package com.iteso.decorator.benefits;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public class Steam extends Benefits {
    /** membership. */
    private Membership membership;
    /** steamCost. */
    private double steamCost = 0;

    /** @return Membership */
    public final Membership getMembership() {
        return membership;
    }

    /** @param m */
    public Steam(final Membership m) {
        this.membership = m;
    }

    /** @return String */
    public final String getDescription() {
        return membership.getDescription() + " with steam";
    }

    /** @return double*/
    public final double cost() {
        return membership.cost() + steamCost;
    }
}
