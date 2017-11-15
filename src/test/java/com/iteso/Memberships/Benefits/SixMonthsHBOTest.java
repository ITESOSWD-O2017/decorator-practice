package com.iteso.Memberships.Benefits;

import com.iteso.Memberships.Gold;
import com.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SixMonthsHBOTest {
    User user;
    User nullUser;
    @Before
    public void setUp() throws Exception {
        user = new Gold();
        user = new SixMonthsHBO(user);
    }

    @Test
    public void checkSixHBO() throws Exception {
        assertEquals("Gold membership, six months HBO free,",user.getProperties());
    }

    @Test
    public void checkSixMonthsHBO() {
        user = new OneYearSubscription(user);
        user = new OneMonthGOT(user);
        assertEquals("Gold membership, six months HBO free, netflix subscription for one year, one month of game Of thrones,",user.getProperties());
    }

    @Test
    public void checkNullUser() {
        user = new FreeDocumentaries(nullUser);
        assertEquals("Please instantiate a membership.",user.getProperties());
    }

}