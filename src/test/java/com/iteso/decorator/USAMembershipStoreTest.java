package com.iteso.decorator;

import com.iteso.decorator.factories.LAMembershipStore;
import com.iteso.decorator.factories.USAMembershipStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class USAMembershipStoreTest {
    USAMembershipStore usaMembershipStore;
    Membership m;

    @Before
    public void setUp() {
        usaMembershipStore = new USAMembershipStore();
    }

    @Test
    public void checkMembershipWhenIsBronze() {
        Membership b = usaMembershipStore.createMembershipFactory("Bronze");
        assertTrue(b.getDescription().contains("Bronze"));
    }
    @Test
    public void checkMembershipWhenIsSilver() {
        Membership s = usaMembershipStore.createMembershipFactory("Silver");
        assertTrue(s.getDescription().contains("Silver"));
    }
    @Test
    public void checkMembershipWhenIsGold() {
        Membership g = usaMembershipStore.createMembershipFactory("Gold");
        assertTrue(g.getDescription().contains("Gold"));
    }
    @Test
    public void checkMembershipWhenIsPlatinum() {
        Membership p = usaMembershipStore.createMembershipFactory("Platinum");
        assertTrue(p.getDescription().contains("Platinum"));
    }
}
