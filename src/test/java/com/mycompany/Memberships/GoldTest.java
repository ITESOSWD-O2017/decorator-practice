package com.mycompany.Memberships;
import com.mycompany.Membership;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GoldTest {
    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new Gold();
    }

    @Test
    public void checkMembership(){
        assertEquals("Gold membership", membership.getMembership());
    }

}