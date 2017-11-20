package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public class Platinum extends Membership {

    public Platinum() {
        description = "Platinum membership";
    }
    /** @return double*/
    public final double cost() {
        return 25;
    }
}
