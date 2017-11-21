package tiposmembresia;

/**
 *
 */
public class MemPlatinum extends Membresia {
    /**
     *
     */
    static final float EXTRA = (float) 39.99;
    /**
     *
     */
    public MemPlatinum() {
        description = "Membresia Plat";
    }
    /**
     *
     * @return ok
     */
    public final double costo() {
        return EXTRA;
    }
}
