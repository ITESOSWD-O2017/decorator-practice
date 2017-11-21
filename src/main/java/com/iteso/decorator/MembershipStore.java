package com.iteso.decorator;

/**
 * Created by AlejandraSahagun on 20/11/17.
 */
public abstract class MembershipStore {

    /**
     * @param type type
     * @return membership. */
    public final Membership newMembership(final String type) {
        Membership membership;
        membership = createMembershipFactory(type);

        membership.printCredential();

        return membership;
    }

    /**
     * @param type type
     * @return membership */
    protected abstract Membership createMembershipFactory(String type);

}
