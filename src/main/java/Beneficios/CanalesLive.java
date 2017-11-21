package Beneficios;

import TiposMembresia.Membresia;

public class CanalesLive extends TipoBeneficio {
    Membresia membresia;

    public CanalesLive(Membresia membresia){this.membresia = membresia; }
    @Override
    public String getDescription() {
        return membresia.getDescription() + " En vivo";
    }
    @Override
    public double costo() {
        return membresia.costo()+ 1.05;
    }
}
