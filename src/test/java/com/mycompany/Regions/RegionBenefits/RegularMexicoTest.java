package com.mycompany.Regions.RegionBenefits;

import com.mycompany.Membership;
import com.mycompany.Regions.Mexico;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularMexicoTest {

    Mexico mexico;

    Membership membership;

    @Before
    public void setUp() throws Exception {
        mexico = new Mexico();
        membership = (Membership) mexico.createMembershipFactory("Regular Membership");


    }

    @Test
    public void MexicoGold() {
        assertEquals("Mexico Regular membership, free use of towels.",membership.getMembership());
    }

    @Test
    public void checkNull(){
        assertEquals(null, mexico.createMembershipFactory(""));
    }
}