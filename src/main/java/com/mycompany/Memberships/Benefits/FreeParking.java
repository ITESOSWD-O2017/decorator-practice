package com.mycompany.Memberships.Benefits;
import com.mycompany.Memberships.BenefitsMembership;
import com.mycompany.Membership;

/**
 * Class Parking.
 */
public class FreeParking extends BenefitsMembership {
    /**
     * parking.
     */
    private Membership parking;

    /**
     * default constructor.
     * @param parkings a.
     */
    public FreeParking(final Membership parkings) {
        this.parking = parkings;
    }

    /**
     * a.
     * @return membership.
     */
    public final String getMembership() {
        if (this.parking != null) {
            return this.parking.getMembership() + ", free parking!";
        } else {
            return "Add your membership type";
        }
    }
}

