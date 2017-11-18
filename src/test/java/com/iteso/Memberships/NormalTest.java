package com.iteso.Memberships;

import com.iteso.Membership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NormalTest {
    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new Normal();
    }

    @Test
    public void checkMembership(){
        assertEquals("Normal membership,", membership.getProperties());
    }

}