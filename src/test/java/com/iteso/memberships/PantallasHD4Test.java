package com.iteso.memberships;

import com.iteso.Membership;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PantallasHD4Test {

    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new PantallasHD4();
    }

    @Test
    public void checkMembership() {
        Assert.assertEquals("Tipo de usuario: HD4", membership.getCharacteristics());


    }

}
