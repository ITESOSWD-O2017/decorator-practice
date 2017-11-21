package com.mycompany;

/**
 * Membership class.
 *
 */
public abstract class Membership {

    /**Property to be set.
     */
    private String membershipUser = "A user";
    /**
     * Getting a membership.
     * @return membership.
     */
    public abstract String getMembership();

    /**
     * Getting a membership.
     * @param membership setting membership.
     */
    public final void setMembership(final String membership) {
        this.membershipUser = membership;
    }
    /**
     * Getting a membership.
     * @return end.
     */
    public final String sendMembership() {
        return this.membershipUser;
    }

}
