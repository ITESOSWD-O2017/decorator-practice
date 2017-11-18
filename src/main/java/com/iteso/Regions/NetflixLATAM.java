package com.iteso.Regions;
import com.iteso.Netflix;
import com.iteso.Membership;
import com.iteso.Regions.RegionBenefits.GoldLATAM;
import com.iteso.Regions.RegionBenefits.PlatinumLATAM;
import com.iteso.Regions.RegionBenefits.SilverLATAM;
import com.iteso.Regions.RegionBenefits.NormalLATAM;

/**
 * Netflix LA.
 */
public class NetflixLATAM extends Netflix {
    /**
     * Membership.
     */
    private Membership membership = new Membership() {
        @Override
        public String getProperties() {
            return null;
        }
    };

    @Override
    public final Membership createMembershipFactory(final String type) {
        if (type.equals("Gold Membership")) {
            return new GoldLATAM(this.membership);
        } else if (type.equals("Silver Membership")) {
            return new SilverLATAM(this.membership);
        } else if (type.equals("Normal Membership")) {
            return new NormalLATAM(this.membership);
        } else if (type.equals("Platinum Membership")) {
            return new PlatinumLATAM(this.membership);
        } else {
            return null;
        }
    }
}

