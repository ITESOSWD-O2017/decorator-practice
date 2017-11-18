package com.iteso.Regions;


import com.iteso.Membership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NetflixUSATest {

    NetflixUSA usa;
    Membership membership;


    @Before
    public void setUp() throws Exception {
        usa = new NetflixUSA();
    }

    @Test
    public void checkNull(){
        assertEquals(null, usa.createMembershipFactory(""));
    }
}