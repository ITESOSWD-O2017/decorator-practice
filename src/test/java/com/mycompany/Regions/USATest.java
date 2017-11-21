package com.mycompany.Regions;

import com.mycompany.Membership;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class USATest {

    USA usa;
    Membership membership;


    @Before
    public void setUp() throws Exception {
        usa = new USA();
    }

    @Test
    public void checkNull(){
        assertEquals(null, usa.createMembershipFactory(""));
    }
}