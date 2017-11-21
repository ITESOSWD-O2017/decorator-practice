package tiposmembresia;

/**
 *
 */
public class MemKids extends Membresia {
    /**
     *
     */
    static final float EXTRA = (float) 5.99;

    /**
     *
     */
    public MemKids() {
        description = "Membresia Kids";
    }

    /**
     *
     * @return ok
     */
    public final double costo() {
        return EXTRA;
    }
}
