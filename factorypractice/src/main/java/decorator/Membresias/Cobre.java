package decorator.Membresias;

import decorator.Membresia;

/**
 *
 */
public class Cobre extends Membresia {
    /**
     *
     */
    static final int DURACION = 9999;

    /**
     *
     */
    public Cobre() {
        setDescription("Cobre");
    }

    /**
     *
     * @return f
     */
    public final String getDescription() {
        return "Cobre";
    }

    /**
     *
     * @return f
     */
    @Override
    public final double cost() {
        return 0;
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
