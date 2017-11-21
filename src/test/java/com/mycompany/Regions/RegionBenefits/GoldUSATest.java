package com.mycompany.Regions.RegionBenefits;

import com.mycompany.Membership;
import com.mycompany.Regions.USA;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoldUSATest {

    USA usa;

    Membership membership;

    @Before
    public void setUp() throws Exception {
        usa = new USA();
        membership = (Membership) usa.createMembershipFactory("Gold Membership");


    }

    @Test
    public void USAGold() {
        assertEquals("USA Gold membership, free use of towels., free locker., free parking!, free monthly protein shake.",membership.getMembership());
    }

    @Test
    public void checkNull(){
        assertEquals(null, usa.createMembershipFactory(""));
    }
}