package com.iteso.decorator;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public abstract class Membership {

    /** subscriber. */
    private String subscriber;

    /** constructor. */
    public Membership() {
        super();
    }

    /** @return String */
    public final String getSubscriber() {
        return subscriber;
    }

    /** @return String */
    private String description = "";

    /** @return String */
    public abstract String getDescription();

    /** @param d */
    public Membership(final String d) {
        this.description = d;
    }

    /** @return double */
    public abstract double cost();

    /** void printCredential. */
    public final void printCredential() {
        System.out.print("Typing " + subscriber);
        System.out.println("Adding photo...");
        System.out.println("Adding number of subscriber...");
        System.out.println("Printing...");
    }

}
