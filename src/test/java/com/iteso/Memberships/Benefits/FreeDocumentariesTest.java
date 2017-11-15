package com.iteso.Memberships.Benefits;

import com.iteso.Memberships.Normal;
import com.iteso.Memberships.Platinum;
import com.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FreeDocumentariesTest {
    User user;
    @Before
    public void setUp() throws Exception {
        user = new Normal();
        user = new FreeDocumentaries(user);
    }

    @Test
    public void getFreeDocumentaries() {
        assertEquals("Normal membership, free documentaries,",user.getProperties());
    }

    @Test
    public void getPlatinumMembership() {
        user = new TwoMonthGOT(user);
        user = new FreeMoviesFifteenPerMonth(user);
        assertEquals("Normal membership, free documentaries, two months of game Of thrones, free 15 movies per month,",user.getProperties());
    }

    @Test
    public void getGoldMembership() {
        user = new OneYearSubscription(user);
        user = new UnlimitedSeries(user);
        assertEquals("Normal membership, free documentaries, netflix subscription for one year, unlimited series,",user.getProperties());
    }

}