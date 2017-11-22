package com.mycompany.app.Users.qualities;

import com.mycompany.app.Users.users.User;
import com.mycompany.app.Users.users.UsersDecorator;

public class DescuentoDiam extends UsersDecorator{
    User user;

    public DescuentoDiam (User user){
        this.user = user;
    }

    public String getDescription() {
        return user.getDescription() + " Descuento al pedido";
    }

    public double price() {return user.price() - user.price()*0.50;
    }
}