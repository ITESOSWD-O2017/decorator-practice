package beneficios;

import tiposmembresia.Membresia;
/**
 *
 */
public class CanalesRegulares extends TipoBeneficio {
    /**
     *
     */
    private Membresia membresia;
    /**
     *@return ok
     */
    public final Membresia getMembresia() {
        return membresia;
    }
    /**
     *@param mem This is a parameter
     */
    public CanalesRegulares(final Membresia mem) {
        this.membresia = mem;
    }
    @Override
    public final String getDescription() {
        return membresia.getDescription() + " con tv abierta";
    }
    @Override
    public final double costo() {
        return membresia.costo();
    }

}
