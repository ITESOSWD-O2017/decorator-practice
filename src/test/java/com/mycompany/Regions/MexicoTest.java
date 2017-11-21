package com.mycompany.Regions;

import com.mycompany.Membership;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MexicoTest {

    Mexico mexico;
    Membership membership;


    @Before
    public void setUp() throws Exception {
        mexico = new Mexico();
    }

    @Test
    public void checkNull(){
        assertEquals(null, mexico.createMembershipFactory(""));
    }
}