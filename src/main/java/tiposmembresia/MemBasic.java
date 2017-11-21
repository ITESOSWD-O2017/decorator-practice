package tiposmembresia;

/**
 *
 */
public class MemBasic extends Membresia {
    /**
     *
     */
    static final float EXTRA = (float) 9.99;
    /**
     *
     */
    public MemBasic() {
        description = "Membresia Normal";
    }
    /**
     *
     * @return ok
     */
    public final double costo() {
        return EXTRA;
    }
}
