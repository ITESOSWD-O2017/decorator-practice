package com.iteso.Memberships.Benefits;
import com.iteso.Memberships.BenefitsClass;
import com.iteso.Membership;

/**.
 * Class more
 */
public class MorePlaylists extends BenefitsClass {

    /**
     * Membership param.
     */
    private Membership morePlaylistsMembership;
    /**
     * Constructor.
     * @param membership receives a membership.
     */
    public MorePlaylists(final Membership membership) {

        this.morePlaylistsMembership = membership;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.morePlaylistsMembership != null) {
            return this.morePlaylistsMembership.getProperties()
                    + " more playlists,";
        } else {
            return "Please instantiate a membership.";
        }
    }
}
