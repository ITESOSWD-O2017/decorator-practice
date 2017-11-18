package com.iteso.Memberships.Benefits;

import com.iteso.Memberships.Normal;
import com.iteso.Membership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FreeDocumentariesTest {
    Membership membership;
    @Before
    public void setUp() throws Exception {
        membership = new Normal();
        membership = new FreeDocumentaries(membership);
    }

    @Test
    public void getFreeDocumentaries() {
        assertEquals("Normal membership, free documentaries,", membership.getProperties());
    }

    @Test
    public void getPlatinumMembership() {
        membership = new TwoMonthGOT(membership);
        membership = new FreeMoviesFifteenPerMonth(membership);
        assertEquals("Normal membership, free documentaries, two months of game Of thrones, free 15 movies per month,", membership.getProperties());
    }

    @Test
    public void getGoldMembership() {
        membership = new OneYearSubscription(membership);
        membership = new UnlimitedSeries(membership);
        assertEquals("Normal membership, free documentaries, netflix subscription for one year, unlimited series,", membership.getProperties());
    }

}