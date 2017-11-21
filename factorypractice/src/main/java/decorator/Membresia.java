package decorator;

/**
 *
 */
public abstract class Membresia {
    /**
     *
     */
    private String description;

    /**
     *
     * @return ddd
     */
    public abstract String getDescription();

    /**
     *
     * @param st ccc
     */
    public final void setDescription(final String st) {
        description = st;
    }

    /**
     *
     * @return cc
     */
    public abstract double cost();

    /**
     *
     * @return cc
     */
    public abstract double duration();

}
