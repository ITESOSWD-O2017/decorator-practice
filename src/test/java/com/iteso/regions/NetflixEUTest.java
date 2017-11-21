package com.iteso.regions;

import com.iteso.Regions.NetflixEU;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NetflixEUTest {

    NetflixEU netflixEU;

    @Before
    public void setUp() throws Exception {
        netflixEU = new NetflixEU();
    }

    @Test
    public void checkNull(){
        assertEquals(null, netflixEU.createMembershipFactory(""));
    }

}
