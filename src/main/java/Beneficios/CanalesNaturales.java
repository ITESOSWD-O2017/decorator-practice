package Beneficios;

import TiposMembresia.Membresia;

public class CanalesNaturales extends TipoBeneficio {
    Membresia membresia;
    public CanalesNaturales(Membresia membresia){this.membresia = membresia; }
    @Override
    public String getDescription() {
        return membresia.getDescription() + " con perritos";
    }
    @Override
    public double costo() {
        return membresia.costo();
    }
}
