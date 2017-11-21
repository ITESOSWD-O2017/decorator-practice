package com.mycompany.Regions.RegionBenefits;

import com.mycompany.Membership;
import com.mycompany.Regions.Mexico;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlatinumMexicoTest {

    Mexico mexico;

    Membership membership;

    @Before
    public void setUp() throws Exception {
        mexico = new Mexico();
        membership = (Membership) mexico.createMembershipFactory("Platinum Membership");


    }

    @Test
    public void MexicoGold() {
        assertEquals("Mexico Platinum membership, free use of towels., free locker., free parking!",membership.getMembership());
    }

    @Test
    public void checkNull(){
        assertEquals(null, mexico.createMembershipFactory(""));
    }
}