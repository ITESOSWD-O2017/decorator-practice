package com.iteso.Memberships;

import com.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NormalTest {
    User user;

    @Before
    public void setUp() throws Exception {
        user = new Normal();
    }

    @Test
    public void checkMembership(){
        assertEquals("Normal membership,",user.getProperties());
    }

}