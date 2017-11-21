package Beneficios;

import TiposMembresia.Membresia;

public class CanalesRec extends TipoBeneficio {
    Membresia membresia;
    public CanalesRec(Membresia membresia){this.membresia = membresia; }
    @Override
    public String getDescription() {
        return membresia.getDescription() + " con VCR";
    }
    @Override
    public double costo() {
        return membresia.costo()+ .75;
    }
}
