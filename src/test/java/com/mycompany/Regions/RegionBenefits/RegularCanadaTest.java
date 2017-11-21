package com.mycompany.Regions.RegionBenefits;

import com.mycompany.Membership;
import com.mycompany.Regions.Canada;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularCanadaTest {

    Canada canada;

    Membership membership;

    @Before
    public void setUp() throws Exception {
        canada = new Canada();
        membership = (Membership) canada.createMembershipFactory("Regular Membership");


    }

    @Test
    public void CanadaGold() {
        assertEquals("Canada Regular membership, free use of towels.",membership.getMembership());
    }

    @Test
    public void checkNull(){
        assertEquals(null, canada.createMembershipFactory(""));
    }
}