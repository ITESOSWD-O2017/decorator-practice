package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public class Bronze extends Membership {

    public Bronze() {
        description = "Bronze membership";
    }

    /** @return double*/
    public final double cost() {
        return 20;
    }
}