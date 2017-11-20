package com.iteso.decorator;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public abstract class Membership {

    public Membership() {
        super();
    }

    /** @return String */
    public String description = "Any membership";

    /** @return String */
    public String getDescription() {
        return description;
    }

    /** @param d */
    public Membership(final String d) {
        this.description = d;
    }

    /** @return double */
    public abstract double cost();

}
