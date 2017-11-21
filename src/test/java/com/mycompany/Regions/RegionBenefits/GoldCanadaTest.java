package com.mycompany.Regions.RegionBenefits;
import com.mycompany.Membership;
import com.mycompany.Regions.Canada;
import com.mycompany.UniversalGym;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GoldCanadaTest{
    Canada canada;

    Membership membership;

    @Before
    public void setUp() throws Exception {
        canada = new Canada();
        membership = (Membership) canada.createMembershipFactory("Gold Membership");


    }

    @Test
    public void CanadaGold() {
        assertEquals("Canada Gold membership, free use of towels., free locker., free parking!, free monthly protein shake.",membership.getMembership());
    }

    @Test
    public void checkNull(){
        assertEquals(null, canada.createMembershipFactory(""));
    }
}