package com.iteso.Memberships;
import com.iteso.Membership;

/**.
 * Class bronce
 */
public class BronceMembership extends Membership {

    /**.
     * Set propiedad
     */
    public BronceMembership() {
        setProperty("Bronce membership,");
    }

    @Override
    public final String getProperties() {
        return sendProperty();
    }


}
