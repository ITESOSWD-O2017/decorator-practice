package com.iteso.Regions.RegionBenefits;

import com.iteso.Membership;
import com.iteso.Regions.NetflixLATAM;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoldLATAMTest {

    NetflixLATAM latam;
    NetflixLATAM nLatam;
    Membership membership;
    Membership nullMembership;

    @Before
    public void setUp() throws Exception {
        latam = new NetflixLATAM();
        membership = latam.createMembershipFactory("Gold Membership");
        nLatam = new NetflixLATAM();
        nullMembership = nLatam.createMembershipFactory("");

    }

    @Test
    public void checkGoldLA() {
        assertEquals("LA Gold membership, one month of game Of thrones, free unlimited movies,",membership.getProperties());
    }

    @Test
    public void checkNull(){
        assertEquals(null, nLatam.createMembershipFactory(""));
    }
}