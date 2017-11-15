package com.iteso.Memberships.Benefits;

import com.iteso.Memberships.Normal;
import com.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FreeMoviesFifteenPerMonthTest {
    User user;
    User nullUser;
    @Before
    public void setUp() throws Exception {
        user = new Normal();
        user = new FreeMoviesFifteenPerMonth(user);
    }

    @Test
    public void checkFreeMovies() throws Exception {
        assertEquals("Normal membership, free 15 movies per month,",user.getProperties());
    }

    @Test
    public void checkHBO() {
        user = new SixMonthsHBO(user);
        assertEquals("Normal membership, free 15 movies per month, six months HBO free,",user.getProperties());
    }

    @Test
    public void checkNullUser() {
        user = new SixMonthsHBO(nullUser);
        assertEquals("Please instantiate a membership.",user.getProperties());
    }


}