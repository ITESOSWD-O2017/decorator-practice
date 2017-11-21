package com.iteso.regions;

import com.iteso.Membership;
import com.iteso.Regions.NetflixUSA;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NetflixUSATest {

    NetflixUSA netflixUSA;
    Membership membership;

    @Before
    public void setUp() throws Exception {
        netflixUSA = new NetflixUSA();
    }

    @Test
    public void checkNull(){
        assertEquals(null, netflixUSA.createMembershipFactory(""));
    }

}
