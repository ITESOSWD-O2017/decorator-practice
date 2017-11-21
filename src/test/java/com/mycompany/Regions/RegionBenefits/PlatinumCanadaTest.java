package com.mycompany.Regions.RegionBenefits;

import com.mycompany.Membership;
import com.mycompany.Regions.Canada;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlatinumCanadaTest {

    Canada canada;

    Membership membership;

    @Before
    public void setUp() throws Exception {
        canada = new Canada();
        membership = (Membership) canada.createMembershipFactory("Platinum Membership");


    }

    @Test
    public void CanadaGold() {
        assertEquals("USA Platinum membership, free use of towels., free locker., free parking!, monthly massage., personal instructor.",membership.getMembership());
    }

    @Test
    public void checkNull(){
        assertEquals(null, canada.createMembershipFactory(""));
    }
}