package com.mycompany.app;

/**
 * Clase Usuario para crear para los clientes de cinepolis.
 */
public abstract class User {
    /**
     * membresía actual del usuario.
     */
    private String membership = "Una membresía";

    /**
     *
     * @return la descripcion.
     */
    public abstract String getDescription();
    /**
     *
     * @return la membresía del usuario.
     */
    public final String getMembership() {
        return this.membership;
    }

    /**
     *
     * @param membership1 para iniciar el nombre de la membresía.
     */
    public final void setMembership(final String membership1) {
        this.membership = membership1;
    }

}
