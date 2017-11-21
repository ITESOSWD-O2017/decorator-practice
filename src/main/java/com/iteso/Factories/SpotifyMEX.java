package com.iteso.Factories;
import com.iteso.Membership;
import com.iteso.Spotify;
import com.iteso.Factories.FactoriesBenefits.GoldMEX;
import com.iteso.Factories.FactoriesBenefits.SilverMEX;
import com.iteso.Factories.FactoriesBenefits.BronceMEX;
import com.iteso.Factories.FactoriesBenefits.DiamondMEX;

/**.
 * Class mex
 */
public class SpotifyMEX extends Spotify {
    /**
     * Membership var.
     */
    private Membership membership;

    @Override
    public final Membership createMembershipFactory(final String type) {
        if (type.equals("Gold Membership")) {
            return new GoldMEX(this.membership);
        } else if (type.equals("Silver Membership")) {
            return new SilverMEX(this.membership);
        } else if (type.equals("Bronce Membership")) {
            return new BronceMEX(this.membership);
        } else if (type.equals("Diamond Membership")) {
            return new DiamondMEX(this.membership);
        } else {
            return null;
        }
    }
}
