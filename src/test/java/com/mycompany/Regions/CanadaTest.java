package com.mycompany.Regions;
import com.mycompany.Membership;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CanadaTest {

    Canada canada;
    Membership membership;


    @Before
    public void setUp() throws Exception {
        canada = new Canada();
    }

    @Test
    public void checkNull(){
        assertEquals(null, canada.createMembershipFactory(""));
    }
}