package com.iteso.Memberships.Benefits;

import com.iteso.Membership;
import com.iteso.Memberships.Normal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OneYearSubscriptionTest {
    Membership membership;
    Membership nullMembership;
    @Before
    public void setUp() throws Exception {
        membership = new Normal();
        membership = new OneYearSubscription(membership);
    }

    @Test
    public void checkFreeUnlimitedMovies() throws Exception {
        assertEquals("Normal membership, netflix subscription for one year,", membership.getProperties());
    }

    @Test
    public void checkSixMonthsHBO() {
        membership = new OneMonthGOT(membership);
        assertEquals("Normal membership, netflix subscription for one year, one month of game Of thrones,", membership.getProperties());
    }

    @Test
    public void checkNullUser() {
        membership = new FreeDocumentaries(nullMembership);
        assertEquals("Please instantiate a membership.", membership.getProperties());
    }
}