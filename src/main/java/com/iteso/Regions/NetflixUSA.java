package com.iteso.Regions;
import com.iteso.Netflix;
import com.iteso.Membership;
import com.iteso.Regions.RegionBenefits.GoldUSA;
import com.iteso.Regions.RegionBenefits.SilverUSA;
import com.iteso.Regions.RegionBenefits.NormalUSA;
import com.iteso.Regions.RegionBenefits.PlatinumUSA;

/**
 * Netflix LA.
 */
public class NetflixUSA extends Netflix {
    /**
     * Membership var.
     */
    private Membership membership;

    @Override
    public final Membership createMembershipFactory(final String type) {
        if (type.equals("Gold Membership")) {
            return new GoldUSA(this.membership);
        } else if (type.equals("Silver Membership")) {
            return new SilverUSA(this.membership);
        } else if (type.equals("Normal Membership")) {
            return new NormalUSA(this.membership);
        } else if (type.equals("Platinum Membership")) {
            return new PlatinumUSA(this.membership);
        } else {
            return null;
        }
    }
}

