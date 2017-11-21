package Beneficios;

import TiposMembresia.Membresia;

public class CanalesCine extends TipoBeneficio {
    Membresia membresia;
    public CanalesCine(Membresia membresia){this.membresia = membresia; }
    @Override
    public String getDescription() {
        return membresia.getDescription() + " con peliculas";
    }
    @Override
    public double costo() {
        return membresia.costo();
    }
}
