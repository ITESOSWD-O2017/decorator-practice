package decorator.Membresias;

import decorator.Membresia;

/**
 *
 */
public class Bronce extends Membresia {
    /**
     *
     */
    static final int COSTO = 400;
    /**
     *
     */
    static final int DURACION = 3;

    /**
     *
     */
    public Bronce() {
        setDescription("Bronce");
    }

    /**
     *
     * @return f
     */
    public final String getDescription() {
        return "Bronce";
    }

    /**
     *
     * @return f
     */
    @Override
    public final double cost() {
        return COSTO;
    }

    /**
     *
     * @return f
     */
    @Override
    public final double duration() {
        return DURACION;
    }
}
