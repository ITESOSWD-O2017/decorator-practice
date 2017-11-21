package com.mycompany.app;

import com.mycompany.app.benefits.Boletos2x1;
import com.mycompany.app.benefits.ComboGratis;
import com.mycompany.app.factories.BlackFactory;
import com.mycompany.app.factories.FanFactory;
import com.mycompany.app.factories.GoldFactory;
import com.mycompany.app.factories.PlataFactory;
import com.mycompany.app.memberships.Black;

/**
 * Hello world!
 *
 */
public final class App {
    /**
     * Constructor basura solo para el checkstyle.
     */
    private App() {

    }
    /**
     *
     * @param args argumentos.
     */
    public static void main(final String[] args) {
        //First Part
        //Membresias de cinepolis ejemplo de membresia black
        //añadiendo un
        User user1;
        Membership black = new Black();
        black = new ComboGratis(black);
        black = new Boletos2x1(black);
        user1 = black;
        System.out.println("Creacion de membresias por medio de adornos.");
        System.out.println(user1.getDescription());
        //Factory Part
        System.out.println("Creacion de membresias por medio de factory.");
        MemberStore blackStore = new BlackFactory();
        MemberStore fanStore = new FanFactory();
        MemberStore goldStore = new GoldFactory();
        MemberStore plataStore = new PlataFactory();

        Membership membresiaF = fanStore.createMembership();
        Membership membresiaB = blackStore.createMembership();
        Membership membresiaP = plataStore.createMembership();
        Membership membresiaG = goldStore.createMembership();

        user1 = membresiaF;
        System.out.println(user1.getDescription());
        System.out.println(membresiaF.cost());
        user1 = membresiaB;
        System.out.println(user1.getDescription());
        System.out.println(membresiaB.cost());
        user1 = membresiaP;
        System.out.println(user1.getDescription());
        System.out.println(membresiaP.cost());
        user1 = membresiaG;
        System.out.println(user1.getDescription());
        System.out.println(membresiaG.cost());

    }
}
