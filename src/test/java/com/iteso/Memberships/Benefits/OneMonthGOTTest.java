package com.iteso.Memberships.Benefits;

import com.iteso.Membership;
import com.iteso.Memberships.Normal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OneMonthGOTTest {
    Membership membership;
    Membership membershipNull;
    @Before
    public void setUp() throws Exception {
        membership = new Normal();
        membership = new OneMonthGOT(membership);
    }

    @Test
    public void getFOneMonthGOT() {
        assertEquals("Normal membership, one month of game Of thrones,", membership.getProperties());
    }

    @Test
    public void getTwoMonthsGot() {
        membership = new TwoMonthGOT(membership);
        membership = new FreeMoviesFifteenPerMonth(membership);
        assertEquals("Normal membership, one month of game Of thrones, two months of game Of thrones, free 15 movies per month,", membership.getProperties());
    }

    @Test
    public void checkNullUser() {
        membership = new OneYearSubscription(membershipNull);
        assertEquals("Please instantiate a membership.", membership.getProperties());
    }

}