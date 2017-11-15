package com.iteso.Memberships;

import com.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SilverTest {
    User user;

    @Before
    public void setUp() throws Exception {
        user = new Silver();
    }

    @Test
    public void checkMembership(){
        assertEquals("Silver membership,",user.getProperties());
    }

}