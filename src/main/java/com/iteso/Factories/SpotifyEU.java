package com.iteso.Factories;
import com.iteso.Membership;
import com.iteso.Spotify;
import com.iteso.Factories.FactoriesBenefits.GoldEU;
import com.iteso.Factories.FactoriesBenefits.SilverEU;
import com.iteso.Factories.FactoriesBenefits.BronceEU;
import com.iteso.Factories.FactoriesBenefits.DiamondEU;

/**.
 * Class eu
 */
public class SpotifyEU extends Spotify {
    /**
     * Membership var.
     */
    private Membership membership;

    @Override
    public final Membership createMembershipFactory(final String type) {
        if (type.equals("Gold Membership")) {
            return new GoldEU(this.membership);
        } else if (type.equals("Silver Membership")) {
            return new SilverEU(this.membership);
        } else if (type.equals("Bronce Membership")) {
            return new BronceEU(this.membership);
        } else if (type.equals("Diamond Membership")) {
            return new DiamondEU(this.membership);
        } else {
            return null;
        }
    }
}
