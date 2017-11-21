package com.iteso.decorator.factories;

import com.iteso.decorator.Membership;
import com.iteso.decorator.MembershipStore;
import com.iteso.decorator.memberships.regions_memberships.USABronze;
import com.iteso.decorator.memberships.regions_memberships.USAGold;
import com.iteso.decorator.memberships.regions_memberships.USAPlatinum;
import com.iteso.decorator.memberships.regions_memberships.USASilver;

/**
 * Created by AlejandraSahagun on 20/11/17.
 */
public class USAMembershipStore extends MembershipStore {
    /** Membership. */
    private Membership m;

    /**
     * @param type type
     * @return membership
     **/
    public final Membership createMembershipFactory(final String type) {
        if (type.equals("Platinum")) {
            return new USAPlatinum(m);
        } else if (type.equals("Gold")) {
            return new USAGold(m);
        } else if (type.equals("Silver")) {
            return new USASilver(m);
        } else if (type.equals("Bronze")) {
            return new USABronze(m);
        } else {
            return null;
        }
    }
}
