package Beneficios;

import TiposMembresia.Membresia;

public class CanalesRegulares extends TipoBeneficio {
    Membresia membresia;
    public CanalesRegulares (Membresia membresia){this.membresia = membresia; }
    @Override
    public String getDescription() {
        return membresia.getDescription() + " Regular";
    }
    @Override
    public double costo() {
        return membresia.costo();
    }
}
