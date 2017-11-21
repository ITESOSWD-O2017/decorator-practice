package com.iteso;

/**.
 * Class membership
 */
public abstract class Membership {

    /**.
     * Var
     */
    private String propertyUser = "The user";

    /**
     *
     * @return obtener prop
     */
    public abstract String getProperties();

    /**
     *
     * @param property propert
     */
    public final void setProperty(final String property) {
        this.propertyUser = property;
    }

    /**
     *
     * @return propiedad
     */
    public final String sendProperty() {
        return this.propertyUser;
    }

}
