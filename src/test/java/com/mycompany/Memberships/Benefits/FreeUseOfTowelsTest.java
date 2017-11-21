package com.mycompany.Memberships.Benefits;
import org.junit.Before;
import org.junit.Test;
import com.mycompany.Membership;
import com.mycompany.Memberships.Gold;
import static org.junit.Assert.assertEquals;

public class FreeUseOfTowelsTest {
    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new Gold();
    }

    @Test
    public void testGetMembership() throws Exception {
        assertEquals("Gold membership", membership.getMembership());
    }

    @Test
    public void UseOfTowels(){
        membership = new FreeUseOfTowels(membership);
        assertEquals("Gold membership, free use of towels.", membership.getMembership());
    }

}