package com.iteso.Memberships.Benefits;

import com.iteso.Memberships.Normal;
import com.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OneYearSubscriptionTest {
    User user;
    User nullUser;
    @Before
    public void setUp() throws Exception {
        user = new Normal();
        user = new OneYearSubscription(user);
    }

    @Test
    public void checkFreeUnlimitedMovies() throws Exception {
        assertEquals("Normal membership, netflix subscription for one year,",user.getProperties());
    }

    @Test
    public void checkSixMonthsHBO() {
        user = new OneMonthGOT(user);
        assertEquals("Normal membership, netflix subscription for one year, one month of game Of thrones,",user.getProperties());
    }

    @Test
    public void checkNullUser() {
        user = new FreeDocumentaries(nullUser);
        assertEquals("Please instantiate a membership.",user.getProperties());
    }
}