package com.mycompany.Regions;
import com.mycompany.UniversalGym;
import  com.mycompany.Membership;
import com.mycompany.Regions.RegionBenefits.GoldMexico;
import com.mycompany.Regions.RegionBenefits.RegularMexico;
import com.mycompany.Regions.RegionBenefits.PlatinumMexico;
import com.mycompany.Regions.RegionBenefits.SilverMexico;

/**
 * class Mexico.
 */
public class Mexico extends UniversalGym {
    /**
     * create membership.
     */
    private Membership membership;

    /**
     *
     * @param type receives a membership.
     * @return a.
     */
    public final Object createMembershipFactory(final String type) {
        if (type.equals("Regular Membership")) {
            return new RegularMexico(this.membership);
        } else if (type.equals("Silver Membership")) {
            return new SilverMexico(this.membership);
        } else if (type.equals("Gold Membership")) {
            return new GoldMexico(this.membership);
        } else if (type.equals("Platinum Membership")) {
            return new PlatinumMexico(this.membership);
        } else {
            return null;
        }
    }
}
