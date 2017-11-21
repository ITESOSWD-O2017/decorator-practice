package Beneficios;

import TiposMembresia.Membresia;

public class CanalesTeleExtra extends TipoBeneficio {
    Membresia membresia;
    public CanalesTeleExtra(Membresia membresia){this.membresia = membresia; }
    @Override
    public String getDescription() {
        return membresia.getDescription() + " con tv extra";
    }
    @Override
    public double costo() {
        return membresia.costo()+ 7.5;
    }
}
