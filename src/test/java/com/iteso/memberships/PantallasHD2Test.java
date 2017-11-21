package com.iteso.memberships;

import com.iteso.Membership;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PantallasHD2Test {

    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new PantallasHD2();
    }

    @Test
    public void checkMembership() {
        Assert.assertEquals("Tipo de usuario: HD2", membership.getCharacteristics());


    }

}
