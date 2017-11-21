package com.iteso.Factories.FactoriesBenefits;
import com.iteso.Membership;
import com.iteso.Memberships.Benefits.MorePlaylists;
import com.iteso.Memberships.Benefits.ExclusiveArtists;
import com.iteso.Memberships.Benefits.ExclusivePlaylists;
import com.iteso.Memberships.Benefits.FreeMonths;
import com.iteso.Memberships.Benefits.NoWifiNeeded;
import com.iteso.Memberships.Benefits.ShareSongs;
import com.iteso.Memberships.Benefits.SongsStoraged;
import com.iteso.Memberships.Benefits.UnlimitedDownloads;
import com.iteso.Memberships.DiamondMembership;

/**.
 * Class USA
 */
public class DiamondUSA extends Membership {
    /**
     * Membership attribute.*/
    private Membership membership;

    @Override
    public final String getProperties() {
        if (this.membership.getProperties() == null) {
            return  "Please assign a membership";
        } else {
            return "USA " + this.membership.getProperties();
        }
    }
    /**
     * Constructor.
     * @param m membership.*/
    public DiamondUSA(final Membership m) {
        this.membership = m;
        this.membership = new DiamondMembership();
        this.membership = new MorePlaylists(membership);
        this.membership = new ExclusiveArtists(membership);
        this.membership = new ExclusivePlaylists(membership);
        this.membership = new FreeMonths(membership);
        this.membership = new NoWifiNeeded(membership);
        this.membership = new ShareSongs(membership);
        this.membership = new SongsStoraged(membership);
        this.membership = new UnlimitedDownloads(membership);
    }
}
