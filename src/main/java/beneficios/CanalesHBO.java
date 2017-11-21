package beneficios;

import tiposmembresia.Membresia;
/**
 *
 */
public class CanalesHBO extends TipoBeneficio {
    /**
     *
     */
    static final int EXTRA = 20;
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
    public CanalesHBO(final Membresia mem) {
        this.membresia = mem;
    }
    @Override
    public final String getDescription() {
        return membresia.getDescription() + " con HBO";
    }
    @Override
    public final double costo() {
        return membresia.costo() + EXTRA;
    }
}
