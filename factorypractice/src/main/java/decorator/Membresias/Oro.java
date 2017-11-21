package decorator.Membresias;

import decorator.Membresia;

/**
 *
 */
public class Oro extends Membresia {
    /**
     *
     */
    static final int COSTO = 1100;
    /**
     *
     */
    static final int DURACION = 12;

    /**
     *
     */
    public Oro() {
        setDescription("Oro");
    }

    /**
     *
     * @return fff
     */
    public final String getDescription() {
        return "Oro";
    }

    /**
     *
     * @return fffff
     */
    @Override
    public final double cost() {
        return COSTO;
    }

    /**
     *
     * @return fffffff
     */
    @Override
    public final double duration() {
        return DURACION;
    }
}

