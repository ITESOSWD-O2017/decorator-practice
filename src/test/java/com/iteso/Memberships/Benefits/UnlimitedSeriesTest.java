package com.iteso.Memberships.Benefits;

import com.iteso.Memberships.Gold;
import com.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnlimitedSeriesTest {
    User user;
    User userNull;
    @Before
    public void setUp() throws Exception {
        user = new Gold();
        user = new UnlimitedSeries(user);
    }

    @Test
    public void getTwoMonthsGOT() {
        assertEquals("Gold membership, unlimited series,",user.getProperties());
    }

    @Test
    public void getTFreeMovies() {
        user = new OneMonthGOT(user);
        assertEquals("Gold membership, unlimited series, one month of game Of thrones,",user.getProperties());
    }

    @Test
    public void checkNullUser() {
        user = new OneYearSubscription(userNull);
        assertEquals("Please instantiate a membership.",user.getProperties());
    }

}