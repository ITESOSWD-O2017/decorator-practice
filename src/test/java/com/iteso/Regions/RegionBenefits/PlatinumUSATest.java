package com.iteso.Regions.RegionBenefits;

import com.iteso.Membership;
import com.iteso.Regions.NetflixUSA;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlatinumUSATest {

    NetflixUSA usa;
    NetflixUSA nUsa;
    Membership membership;
    Membership nullMembership;

    @Before
    public void setUp() throws Exception {
        usa = new NetflixUSA();
        membership = usa.createMembershipFactory("Platinum Membership");
        nUsa= new NetflixUSA();
        nullMembership = nUsa.createMembershipFactory("");

    }

    @Test
    public void checkNormalUSA() {
        assertEquals("USA Platinum membership, six months HBO free, free documentaries, free unlimited movies, netflix subscription for one year,",membership.getProperties());
    }

    @Test
    public void checkNull(){
        assertEquals(null, nUsa.createMembershipFactory(""));
    }
}