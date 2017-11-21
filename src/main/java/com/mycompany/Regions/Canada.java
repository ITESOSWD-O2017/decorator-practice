package com.mycompany.Regions;
import com.mycompany.Membership;
import com.mycompany.Regions.RegionBenefits.GoldCanada;
import com.mycompany.Regions.RegionBenefits.PlatinumCanada;
import com.mycompany.Regions.RegionBenefits.RegularCanada;
import com.mycompany.Regions.RegionBenefits.SilverCanada;
import com.mycompany.UniversalGym;

/**
 * class Canada.
 */
public class Canada extends UniversalGym {
    /**
     * create membership.
     */
    private Membership membership;

    /**
     * a.
     * @param type receives a membership.
     * @return membership type.
     */
    public final Object createMembershipFactory(final String type) {
        if (type.equals("Regular Membership")) {
            return new RegularCanada(this.membership);
        } else if (type.equals("Silver Membership")) {
            return new SilverCanada(this.membership);
        } else if (type.equals("Gold Membership")) {
            return new GoldCanada(this.membership);
        } else if (type.equals("Platinum Membership")) {
            return new PlatinumCanada(this.membership);
        } else {
            return null;
        }
    }
}
