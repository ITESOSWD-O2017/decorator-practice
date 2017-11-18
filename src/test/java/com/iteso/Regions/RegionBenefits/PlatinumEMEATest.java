package com.iteso.Regions.RegionBenefits;

import com.iteso.Membership;
import com.iteso.Regions.NetflixEMEA;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlatinumEMEATest {

    NetflixEMEA usa;
    NetflixEMEA nUsa;
    Membership membership;
    Membership nullMembership;

    @Before
    public void setUp() throws Exception {
        usa = new NetflixEMEA();
        membership = usa.createMembershipFactory("Platinum Membership");
        nUsa= new NetflixEMEA();
        nullMembership = nUsa.createMembershipFactory("");

    }

    @Test
    public void checkPlatinumEMEA() {
        assertEquals("EMEA Platinum membership, two months of game Of thrones, free documentaries, free 15 movies per month, unlimited series, netflix subscription for one year,",membership.getProperties());
    }

    @Test
    public void checkNull(){
        assertEquals(null, nUsa.createMembershipFactory(""));
    }
}