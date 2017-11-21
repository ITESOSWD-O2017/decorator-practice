package com.iteso.Memberships;
import com.iteso.Membership;

/**.
 * Class gold
 */
public class GoldMembership extends Membership {

    /**.
     * Method
     */
    public GoldMembership() {
        setProperty("Gold membership,");
    }

    @Override
    public final String getProperties() {
        return sendProperty();
    }


}
