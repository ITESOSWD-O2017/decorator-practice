package com.iteso.decorator.factories;

import com.iteso.decorator.Membership;
import com.iteso.decorator.MembershipStore;
import com.iteso.decorator.memberships.regions_memberships.EUBronze;
import com.iteso.decorator.memberships.regions_memberships.EUGold;
import com.iteso.decorator.memberships.regions_memberships.EUPlatinum;
import com.iteso.decorator.memberships.regions_memberships.EUSilver;

/**
 * Created by AlejandraSahagun on 20/11/17.
 */
public class EUMembershipStore extends MembershipStore {
    /** Membership. */
    private Membership m;
    /**
     * @param type type
     * @return membership
     **/
    public final Membership createMembershipFactory(final String type) {
        if (type.equals("Platinum")) {
            return new EUPlatinum(m);
        } else if (type.equals("Gold")) {
            return new EUGold(m);
        } else if (type.equals("Silver")) {
            return new EUSilver(m);
        } else if (type.equals("Bronze")) {
            return new EUBronze(m);
        } else {
            return null;
        }
    }
}
