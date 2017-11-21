package com.iteso.decorator;

import com.iteso.decorator.factories.EUMembershipStore;
import com.iteso.decorator.factories.LAMembershipStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LAMembershipStoreTest {
    LAMembershipStore laMembershipStore;
    Membership m;

    @Before
    public void setUp() {
        laMembershipStore = new LAMembershipStore();
    }

    @Test
    public void checkMembershipWhenIsBronze() {
        Membership b = laMembershipStore.createMembershipFactory("Bronze");
        assertTrue(b.getDescription().contains("Bronze"));
    }
    @Test
    public void checkMembershipWhenIsSilver() {
        Membership s = laMembershipStore.createMembershipFactory("Silver");
        assertTrue(s.getDescription().contains("Silver"));
    }
    @Test
    public void checkMembershipWhenIsGold() {
        Membership g = laMembershipStore.createMembershipFactory("Gold");
        assertTrue(g.getDescription().contains("Gold"));
    }
    @Test
    public void checkMembershipWhenIsPlatinum() {
        Membership p = laMembershipStore.createMembershipFactory("Platinum");
        assertTrue(p.getDescription().contains("Platinum"));
    }
}
