package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public class Silver extends Membership {

    public Silver() {
        description = "Silver membership";
    }
    /** @return double*/
    public final double cost() {
        return 15;
    }
}
