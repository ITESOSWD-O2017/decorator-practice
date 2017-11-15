package com.iteso;

/**
 * User abstract class.
 */
public abstract class User {

    /**Property to be set.
     */
    private String propertyUser = "A user";
    /**
     * Getting a property.
     * @return property.
     */
    public abstract String getProperties();

    /**
     * Getting a property.
     * @param property setting property.
     */
    public final void setProperty(final String property) {
        this.propertyUser = property;
    }
    /**
     * Getting a property.
     * @return end.
     */
    public final String sendProperty() {
        return this.propertyUser;
    }
}
