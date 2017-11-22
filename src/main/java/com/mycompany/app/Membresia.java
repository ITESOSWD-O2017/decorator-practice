package com.mycompany.app;

/**
 * Clase padre de membresias.
 */
public abstract class Membresia {

    /**
     * Descripcion de la membresia.
     */
    private String description = "Membresía X";

    /**
     * Getter membresia.
     * @return String Descripcion de membresia.
     */
    public final String getDescription() {
        return description;
    }

    /**
     * Setter membresia.
     * @param inDescription devuelve la membresia.
     */
    public final void setDescription(final String inDescription) {
        this.description = description;
    }

    /**
     * Costo de la membresia.
     * @return double retorna el costo de la membresia.
     */
    public abstract double cost();

}
