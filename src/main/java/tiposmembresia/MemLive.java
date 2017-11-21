package tiposmembresia;

/**
 *
 */
public class MemLive extends Membresia {
    /**
     *
     */
    static final float EXTRA = (float) 19.99;
    /**
     *
     */
    public MemLive() {
        description = "Membresia Live";
    }
    /**
     *
     * @return ok
     */
    public final double costo() {
        return EXTRA;
    }
}
