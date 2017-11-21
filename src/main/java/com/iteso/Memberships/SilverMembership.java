package com.iteso.Memberships;
import com.iteso.Membership;

/**.
 * Metodo
 */
public class SilverMembership extends Membership {

    /**.
     * Method
     */
    public SilverMembership() {
        setProperty("Silver membership,");
    }

    @Override
    public final String getProperties() {
        return sendProperty();
    }


}
