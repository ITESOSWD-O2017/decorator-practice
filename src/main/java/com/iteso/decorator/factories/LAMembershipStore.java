package com.iteso.decorator.factories;

import com.iteso.decorator.Membership;
import com.iteso.decorator.MembershipStore;
import com.iteso.decorator.memberships.regions_memberships.LABronze;
import com.iteso.decorator.memberships.regions_memberships.LAGold;
import com.iteso.decorator.memberships.regions_memberships.LAPlatinum;
import com.iteso.decorator.memberships.regions_memberships.LASilver;

/**
 * Created by AlejandraSahagun on 20/11/17.
 */
public class LAMembershipStore extends MembershipStore {

    /** Membership. */
    private Membership m;
    /**
     * @param type type
     * @return membership
     **/
    public final Membership createMembershipFactory(final String type) {
        if (type.equals("Platinum")) {
            return new LAPlatinum(m);
        } else if (type.equals("Gold")) {
            return new LAGold(m);
        } else if (type.equals("Silver")) {
            return new LASilver(m);
        } else if (type.equals("Bronze")) {
            return new LABronze(m);
        } else {
            return null;
        }
    }
}
