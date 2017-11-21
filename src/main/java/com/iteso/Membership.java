package com.iteso;

import com.iteso.memberships.Benefits;

import java.util.Stack;

/**
 * Membership.
 */
public abstract class Membership {

    /**
     * Variable String.
     */
    private String user = "Default";
    /**
     * Variable Stack de beneficios.
     */
    private Stack<Benefits> benefits = new Stack<Benefits>();

    /**
     * getCharacteristics.
     * @return retorna un String.
     */
    public abstract String getCharacteristics();

    /**
     * Pone un user.
     * @param userio descripcion
     */
    protected final void setUser(final String userio) {
        this.user = userio;
    }

    /**
     * Especifica un beneficio.
     * @param benefit descripcion
     */
    public final void setBenefit(final Benefits benefit) {
        benefits.push(benefit);
    }

    /**
     * Obtiene beneficios.
     * @return retorna un String.
     */
    public final String getBenefits() {
        Stack<Benefits> temp = new Stack<Benefits>();
        Benefits benefit;
        StringBuilder sb = new StringBuilder();
        sb.append("Benefits: ");

        benefit = benefits.pop();
        sb.append(benefit.getBenefit());
        temp.push(benefit);

        int benefitsSize = benefits.size();



        for (int i = 0; i == benefitsSize; i++) {
            benefit = benefits.pop();

            sb.append(", ");
            sb.append(benefit.getBenefit());
            temp.push(benefit);
        }

        benefits = (Stack<Benefits>) temp.clone();

        return sb.toString();
    }

    /**
     * Obtiene el usuario.
     * @return retorna un String.
     */
    public final String getUser() {
        return user;
    }
}
