package com.mycompany;

/**
 * Universal gym class.
 * Create memebrship.
 */
public abstract class UniversalGym {

    /**
     * Tyoes of memberships.
     * @param type receives a membership.
     * @return end.
     */
    public abstract Object createMembershipFactory(String type);
}
