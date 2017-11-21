package com.iteso.Factories;
import com.iteso.Membership;
import com.iteso.Spotify;
import com.iteso.Factories.FactoriesBenefits.GoldUSA;
import com.iteso.Factories.FactoriesBenefits.SilverUSA;
import com.iteso.Factories.FactoriesBenefits.BronceUSA;
import com.iteso.Factories.FactoriesBenefits.DiamondUSA;

/**.
 * Class usa
 */
public class SpotifyUSA extends Spotify {
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
        } else if (type.equals("Bronce Membership")) {
            return new BronceUSA(this.membership);
        } else if (type.equals("Diamond Membership")) {
            return new DiamondUSA(this.membership);
        } else {
            return null;
        }
    }
}
