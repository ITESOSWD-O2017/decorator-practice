package com.iteso.Factories.FactoriesBenefits;
import com.iteso.Membership;
import com.iteso.Memberships.Benefits.MorePlaylists;
import com.iteso.Memberships.Benefits.ExclusiveArtists;
import com.iteso.Memberships.Benefits.ExclusivePlaylists;
import com.iteso.Memberships.Benefits.ShareSongs;
import com.iteso.Memberships.SilverMembership;

/**.
 * Class eu
 */
public class SilverEU extends Membership {
    /**
     * Membership attribute.*/
    private Membership membership;

    @Override
    public final String getProperties() {
        if (this.membership.getProperties() == null) {
            return  "Please assign a membership";
        } else {
            return "EU " + this.membership.getProperties();
        }
    }
    /**
     * Constructor.
     * @param m membership.*/
    public SilverEU(final Membership m) {
        this.membership = m;
        this.membership = new SilverMembership();
        this.membership = new MorePlaylists(membership);
        this.membership = new ExclusiveArtists(membership);
        this.membership = new ExclusivePlaylists(membership);
        this.membership = new ShareSongs(membership);
    }
}
