package Beneficios;

import TiposMembresia.Membresia;

public class CanalesKids extends TipoBeneficio {
    Membresia membresia;
    public CanalesKids(Membresia membresia){this.membresia = membresia; }
    @Override
    public String getDescription() {
        return membresia.getDescription() + " para niños";
    }
    @Override
    public double costo() {
        return membresia.costo()+ .55;
    }
}
