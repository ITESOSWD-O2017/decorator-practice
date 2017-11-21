package com.mycompany.Memberships.Benefits;
import org.junit.Before;
import org.junit.Test;
import com.mycompany.Membership;
import com.mycompany.Memberships.Platinum;
import static org.junit.Assert.assertEquals;

public class PersonalInstructorTest {
    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new Platinum();
    }

    @Test
    public void testGetMembership() throws Exception {
        assertEquals("Platinum membership", membership.getMembership());
    }

    @Test
    public void personalInstructor(){
        membership = new PersonalInstructor(membership);
        assertEquals("Platinum membership, personal instructor.", membership.getMembership());
    }

}