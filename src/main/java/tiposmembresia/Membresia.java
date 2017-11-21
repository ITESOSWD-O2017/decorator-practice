package tiposmembresia;

/**
 *
 */
public abstract class Membresia {
    /**
     *
     */
    private String description = "Membresia";
    /**
     *
     * @return ok
     */
    public final String getDescription() {
        return  description;
    }

    /**
     *
     * @return ok
     */
    public abstract double costo();
}
