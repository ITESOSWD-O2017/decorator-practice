package com.mycompany.app;

public class MembresiaGratis extends Membresia {

    public MembresiaGratis () {
        this.description = "Membresia gratis";
    }

    public double cost() {
        return 0;
    }

}
