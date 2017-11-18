package com.iteso.Regions.RegionBenefits;

import com.iteso.Membership;
import com.iteso.Regions.NetflixUSA;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoldUSATest {

    NetflixUSA usa;
    NetflixUSA nUsa;
    Membership membership;
    Membership nullMembership;

    @Before
    public void setUp() throws Exception {
        usa = new NetflixUSA();
        membership = usa.createMembershipFactory("Gold Membership");
        nUsa= new NetflixUSA();
        nullMembership = nUsa.createMembershipFactory("");

    }

    @Test
    public void checkGoldUSA() {
        assertEquals("USA Gold membership, six months HBO free, free unlimited movies, free documentaries,",membership.getProperties());
    }

    @Test
    public void checkNull(){
        assertEquals(null, nUsa.createMembershipFactory(""));
    }
}