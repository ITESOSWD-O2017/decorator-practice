package com.iteso.decorator;

import com.iteso.decorator.factories.EUMembershipStore;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class EUMembershipStoreTest {
    EUMembershipStore euMembershipStore;
    Membership m;

    @Before
    public void setUp() {
        euMembershipStore = new EUMembershipStore();
    }

    @Test
    public void checkMembershipWhenIsBronze() {
        Membership b = euMembershipStore.createMembershipFactory("Bronze");
        assertTrue(b.getDescription().contains("Bronze"));
    }
    @Test
    public void checkMembershipWhenIsSilver() {
        Membership s = euMembershipStore.createMembershipFactory("Silver");
        assertTrue(s.getDescription().contains("Silver"));
    }
    @Test
    public void checkMembershipWhenIsGold() {
        Membership g = euMembershipStore.createMembershipFactory("Gold");
        assertTrue(g.getDescription().contains("Gold"));
    }
    @Test
    public void checkMembershipWhenIsPlatinum() {
        Membership p = euMembershipStore.createMembershipFactory("Platinum");
        assertTrue(p.getDescription().contains("Platinum"));
    }

}
