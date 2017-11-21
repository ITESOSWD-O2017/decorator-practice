package com.mycompany.Regions;
import com.mycompany.Membership;
import com.mycompany.Regions.RegionBenefits.GoldUSA;
import com.mycompany.Regions.RegionBenefits.PlatinumUSA;
import com.mycompany.Regions.RegionBenefits.RegularUSA;
import com.mycompany.Regions.RegionBenefits.SilverUSA;
import com.mycompany.UniversalGym;

/**
 * class USA.
 */
public class USA extends UniversalGym {
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
            return new RegularUSA(this.membership);
        } else if (type.equals("Silver Membership")) {
            return new SilverUSA(this.membership);
        } else if (type.equals("Gold Membership")) {
            return new GoldUSA(this.membership);
        } else if (type.equals("Platinum Membership")) {
            return new PlatinumUSA(this.membership);
        } else {
            return null;
        }
    }
}
