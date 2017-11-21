package com.mycompany.Memberships;
import com.mycompany.Membership;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlatinumTest {
    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new Platinum();
    }

    @Test
    public void checkMembership(){
        assertEquals("Platinum membership", membership.getMembership());
    }

}