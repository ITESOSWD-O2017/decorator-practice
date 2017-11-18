package com.iteso.Regions.RegionBenefits;

import com.iteso.Membership;
import com.iteso.Regions.NetflixUSA;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SilverUSATest {

    NetflixUSA usa;
    NetflixUSA nUsa;
    Membership membership;
    Membership nullMembership;

    @Before
    public void setUp() throws Exception {
        usa = new NetflixUSA();
        membership = usa.createMembershipFactory("Silver Membership");
        nUsa= new NetflixUSA();
        nullMembership = nUsa.createMembershipFactory("");

    }

    @Test
    public void checkNormalUSA() {
        assertEquals("USA Silver membership, two months of game Of thrones, free documentaries, unlimited series, free 15 movies per month,",membership.getProperties());
    }

    @Test
    public void checkNull(){
        assertEquals(null, nUsa.createMembershipFactory(""));
    }
}