package com.iteso.memberships;

import com.iteso.Membership;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PantallaHD1Test {

    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new PantallaHD1();
    }

    @Test
    public void checkMembership() {
        Assert.assertEquals("Tipo de usuario: HD1", membership.getCharacteristics());


    }
}