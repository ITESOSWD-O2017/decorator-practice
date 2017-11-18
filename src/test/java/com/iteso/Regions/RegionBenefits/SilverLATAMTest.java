package com.iteso.Regions.RegionBenefits;

import com.iteso.Membership;
import com.iteso.Regions.NetflixLATAM;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SilverLATAMTest {

    NetflixLATAM latam;
    NetflixLATAM nLatam;
    Membership membership;
    Membership nullMembership;

    @Before
    public void setUp() throws Exception {
        latam = new NetflixLATAM();
        membership = latam.createMembershipFactory("Silver Membership");
        nLatam = new NetflixLATAM();
        nullMembership = nLatam.createMembershipFactory("");
    }

    @Test
    public void checkGoldLA() {
        assertEquals("LA Silver membership, one month of game Of thrones, free 15 movies per month,",membership.getProperties());
    }

    @Test
    public void checkNull(){
        assertEquals(null, nLatam.createMembershipFactory(""));
    }
}