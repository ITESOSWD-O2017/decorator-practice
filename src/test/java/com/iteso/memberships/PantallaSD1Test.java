package com.iteso.memberships;

import com.iteso.Membership;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PantallaSD1Test {

    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new PantallaSD1();
    }

    @Test
    public void checkMembership() {
        Assert.assertEquals("Tipo de usuario: SD1", membership.getCharacteristics());


    }
}
