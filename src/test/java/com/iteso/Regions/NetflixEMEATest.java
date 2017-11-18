package com.iteso.Regions;


import com.iteso.Membership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NetflixEMEATest {

    NetflixEMEA emea;
    Membership membership;


    @Before
    public void setUp() throws Exception {
        emea = new NetflixEMEA();
    }

    @Test
    public void checkNull(){
        assertEquals(null, emea.createMembershipFactory(""));
    }
}