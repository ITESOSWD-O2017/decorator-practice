package com.iteso.Memberships;

import com.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlatinumTest {
    User user;

    @Before
    public void setUp() throws Exception {
        user = new Platinum();
    }

    @Test
    public void checkMembership(){
        assertEquals("Platinum membership,",user.getProperties());
    }
}