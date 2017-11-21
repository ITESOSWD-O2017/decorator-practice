package com.mycompany.Regions.RegionBenefits;

import com.mycompany.Membership;
import com.mycompany.Regions.USA;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularUSATest {

    USA usa;

    Membership membership;

    @Before
    public void setUp() throws Exception {
        usa = new USA();
        membership = (Membership) usa.createMembershipFactory("Regular Membership");


    }

    @Test
    public void USAGold() {
        assertEquals("USA Regular membership, free use of towels.",membership.getMembership());
    }

    @Test
    public void checkNull(){
        assertEquals(null, usa.createMembershipFactory(""));
    }
}