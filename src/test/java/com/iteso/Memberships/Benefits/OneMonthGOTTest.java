package com.iteso.Memberships.Benefits;

import com.iteso.Memberships.Normal;
import com.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OneMonthGOTTest {
    User user;
    User userNull;
    @Before
    public void setUp() throws Exception {
        user = new Normal();
        user = new OneMonthGOT(user);
    }

    @Test
    public void getFOneMonthGOT() {
        assertEquals("Normal membership, one month of game Of thrones,",user.getProperties());
    }

    @Test
    public void getTwoMonthsGot() {
        user = new TwoMonthGOT(user);
        user = new FreeMoviesFifteenPerMonth(user);
        assertEquals("Normal membership, one month of game Of thrones, two months of game Of thrones, free 15 movies per month,",user.getProperties());
    }

    @Test
    public void checkNullUser() {
        user = new OneYearSubscription(userNull);
        assertEquals("Please instantiate a membership.",user.getProperties());
    }

}