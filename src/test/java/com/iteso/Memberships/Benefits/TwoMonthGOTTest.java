package com.iteso.Memberships.Benefits;

import com.iteso.Membership;
import com.iteso.Memberships.Gold;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoMonthGOTTest {
    Membership membership;
    Membership membershipNull;
    @Before
    public void setUp() throws Exception {
        membership = new Gold();
        membership = new TwoMonthGOT(membership);
    }

    @Test
    public void getTwoMonthsGOT() {
        assertEquals("Gold membership, two months of game Of thrones,", membership.getProperties());
    }

    @Test
    public void getTFreeMovies() {
        membership = new OneMonthGOT(membership);
        membership = new UnlimitedSeries(membership);
        assertEquals("Gold membership, two months of game Of thrones, one month of game Of thrones, unlimited series,", membership.getProperties());
    }

    @Test
    public void checkNullUser() {
        membership = new OneYearSubscription(membershipNull);
        assertEquals("Please instantiate a membership.", membership.getProperties());
    }
}