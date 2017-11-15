package com.iteso.Memberships.Benefits;

import com.iteso.Memberships.Normal;
import com.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FreeMoviesUnlimitedTest {
    User user;
    User nullUser;
    @Before
    public void setUp() throws Exception {
        user = new Normal();
        user = new FreeMoviesUnlimited(user);
    }

    @Test
    public void checkFreeUnlimitedMovies() throws Exception {
        assertEquals("Normal membership, free unlimited movies,",user.getProperties());
    }

    @Test
    public void checkHBO() {
        user = new OneMonthGOT(user);
        assertEquals("Normal membership, free unlimited movies, one month of game Of thrones,",user.getProperties());
    }

    @Test
    public void checkNullUser() {
        user = new FreeDocumentaries(nullUser);
        assertEquals("Please instantiate a membership.",user.getProperties());
    }

}