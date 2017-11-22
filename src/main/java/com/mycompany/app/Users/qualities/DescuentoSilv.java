package com.mycompany.app.Users.qualities;

import com.mycompany.app.Users.users.User;
import com.mycompany.app.Users.users.UsersDecorator;

public class DescuentoSilv extends UsersDecorator{
    User user;

    public DescuentoSilv (User user){
        this.user = user;
    }

    public String getDescription() {
        return user.getDescription() + " Descuento a pedido";
    }

    public double price() {return user.price() - user.price()*0.25;
    }
}