package com.iteso.memberships;

import com.iteso.Membership;

/**
 * Benefits.
 */
public abstract class Benefits extends Membership {

    /**
     * Variable String.
     */
    private String benefit = "Default";

    /**
     * Benefits.
     */
    public Benefits() {
        setUser("Benefit");
    }

    /**
     * getCharacteristics.
     * @return retorna un String.
     */
    public abstract String getCharacteristics();

    /**
     * Pone un beneficio.
     * @param benefitio descripcion
     */
    protected final void setBenefit(final String benefitio) {
        this.benefit = benefitio;
    }

    /**
     * Obtiene un beneficio.
     * @return retorna un beneficio.
     */
    public final String getBenefit() {
        return benefit;
    }

}
