package com.iteso.Memberships.Benefits;
import com.iteso.Memberships.BenefitsClass;
import com.iteso.Membership;

/**.
 * Class playlists
 */
public class ExclusivePlaylists extends BenefitsClass {


    /**
     * Membership param.
     */
    private Membership playlistMembership;
    /**
     * Constructor.
     * @param membership receives a membership.
     */
    public ExclusivePlaylists(final Membership membership) {
        this.playlistMembership = membership;
    }

    /**
     * @return end.
     */
    @Override
    public final String getProperties() {
        if (this.playlistMembership != null) {
            return this.playlistMembership.getProperties()
                    + " exclusive playlists,";
        } else {
            return "Please instantiate a membership.";
        }
    }
}
