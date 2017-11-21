package beneficios;

import tiposmembresia.Membresia;
/**
 *
 */
public class CanalesRec extends TipoBeneficio {
    /**
     *
     */
    static final float EXTRA = (float) .75;
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
    public CanalesRec(final Membresia mem) {
        this.membresia = mem;
    }
    @Override
    public final String getDescription() {
        return membresia.getDescription() + " con VCR";
    }
    @Override
    public final double costo() {
        return membresia.costo() + EXTRA;
    }

}
