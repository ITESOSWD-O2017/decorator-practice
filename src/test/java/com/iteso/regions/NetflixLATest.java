package com.iteso.regions;

import com.iteso.Regions.NetflixLA;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NetflixLATest {

    NetflixLA netflixLA;

    @Before
    public void setUp() throws Exception {
        netflixLA = new NetflixLA();
    }

    @Test
    public void checkNull(){
        assertEquals(null, netflixLA.createMembershipFactory(""));
    }
}
