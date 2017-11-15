package com.iteso.Memberships;

import com.iteso.Memberships.Benefits.TwoMonthGOT;
import com.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoldTest {
    User user;

    @Before
    public void setUp() throws Exception {
        user = new Gold();
    }

    @Test
    public void checkMembership(){
        assertEquals("Gold membership,",user.getProperties());
    }

}