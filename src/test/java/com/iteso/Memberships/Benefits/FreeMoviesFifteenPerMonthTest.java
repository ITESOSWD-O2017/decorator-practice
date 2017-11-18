package com.iteso.Memberships.Benefits;

import com.iteso.Membership;
import com.iteso.Memberships.Normal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FreeMoviesFifteenPerMonthTest {
    Membership membership;
    Membership nullMembership;
    @Before
    public void setUp() throws Exception {
        membership = new Normal();
        membership = new FreeMoviesFifteenPerMonth(membership);
    }

    @Test
    public void checkFreeMovies() throws Exception {
        assertEquals("Normal membership, free 15 movies per month,", membership.getProperties());
    }

    @Test
    public void checkHBO() {
        membership = new SixMonthsHBO(membership);
        assertEquals("Normal membership, free 15 movies per month, six months HBO free,", membership.getProperties());
    }

    @Test
    public void checkNullUser() {
        membership = new SixMonthsHBO(nullMembership);
        assertEquals("Please instantiate a membership.", membership.getProperties());
    }


}