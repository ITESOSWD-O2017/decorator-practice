package com.mycompany.app;

/**
 * Membresia store.
 */
public abstract class MembresiaStore {

    /**
     * Metodo factory para crear membresias.
     * @param benefit Parametro creador.
     * @return Membresia nuevo objeto.
     */
    public abstract Membresia createMembership(String benefit);

}
