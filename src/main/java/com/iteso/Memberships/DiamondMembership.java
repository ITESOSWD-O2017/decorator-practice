package com.iteso.Memberships;
import com.iteso.Membership;

/**.
 * Class diamond
 */
public class DiamondMembership extends Membership {

    /**.
     * Propiedad
     */
    public DiamondMembership() {
        setProperty("Diamond membership,");
    }

    @Override
    public final String getProperties() {
        return sendProperty();
    }


}
