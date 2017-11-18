package com.iteso.Memberships.Benefits;

import com.iteso.Membership;
import com.iteso.Memberships.Gold;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SixMonthsHBOTest {
    Membership membership;
    Membership nullMembership;
    @Before
    public void setUp() throws Exception {
        membership = new Gold();
        membership = new SixMonthsHBO(membership);
    }

    @Test
    public void checkSixHBO() throws Exception {
        assertEquals("Gold membership, six months HBO free,", membership.getProperties());
    }

    @Test
    public void checkSixMonthsHBO() {
        membership = new OneYearSubscription(membership);
        membership = new OneMonthGOT(membership);
        assertEquals("Gold membership, six months HBO free, netflix subscription for one year, one month of game Of thrones,", membership.getProperties());
    }

    @Test
    public void checkNullUser() {
        membership = new FreeDocumentaries(nullMembership);
        assertEquals("Please instantiate a membership.", membership.getProperties());
    }

}