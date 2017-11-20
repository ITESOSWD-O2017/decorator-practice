package com.iteso.decorator;

import com.iteso.decorator.benefits.Locker;
import com.iteso.decorator.benefits.lessons.Yoga;
import com.iteso.decorator.memberships.Bronze;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public class MyMembership {
    /** @param args */
    public static void main(final String[] args) {
        Membership membership = new Bronze();
        System.out.println(membership.getDescription());
        System.out.println("$" + membership.cost() + " MXN");

        membership = new Locker(membership);
        membership = new Yoga(membership);
        System.out.println(membership.getDescription());
        System.out.println("$" + membership.cost() + " MXN");
    }
}
