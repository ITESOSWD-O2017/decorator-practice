package Beneficios;

import TiposMembresia.Membresia;

public class CanalesHBO extends TipoBeneficio {
    Membresia membresia;
    public CanalesHBO(Membresia membresia){this.membresia = membresia; }
    @Override
    public String getDescription() {
        return membresia.getDescription() + " con HBO";
    }
    @Override
    public double costo() {
        return membresia.costo()+ 20;
    }
}
