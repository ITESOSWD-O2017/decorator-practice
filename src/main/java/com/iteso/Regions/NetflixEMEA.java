package com.iteso.Regions;
import com.iteso.Netflix;
import com.iteso.Membership;
import com.iteso.Regions.RegionBenefits.GoldEMEA;
import com.iteso.Regions.RegionBenefits.SilverEMEA;
import com.iteso.Regions.RegionBenefits.NormalEMEA;
import com.iteso.Regions.RegionBenefits.PlatinumEMEA;

/**
 * Netflix LA.
 */
public class NetflixEMEA extends Netflix {
    /**
     * Membership var.
     */
    private Membership membership;

    @Override
    public final Membership createMembershipFactory(final String type) {
        if (type.equals("Gold Membership")) {
            return new GoldEMEA(this.membership);
        } else if (type.equals("Silver Membership")) {
            return new SilverEMEA(this.membership);
        } else if (type.equals("Normal Membership")) {
            return new NormalEMEA(this.membership);
        } else if (type.equals("Platinum Membership")) {
            return new PlatinumEMEA(this.membership);
        } else {
            return null;
        }
    }
}

