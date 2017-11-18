package com.iteso.Regions;


import com.iteso.Membership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NetflixLATAMTest {

    NetflixEMEA latam;
    Membership membership;


    @Before
    public void setUp() throws Exception {
        latam = new NetflixEMEA();
    }

    @Test
    public void checkNull(){
        assertEquals(null, latam.createMembershipFactory(""));
    }
}