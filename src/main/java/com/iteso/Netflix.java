package com.iteso;

/**
 * Netflix abstract class.
 */
public abstract class Netflix {
    /**
     * Tyoes of memberships.
     * @param type receives a membership.
     * @return end.
     */
    public abstract Object createMembershipFactory(String type);

}
