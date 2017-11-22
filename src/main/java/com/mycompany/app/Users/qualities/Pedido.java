package com.mycompany.app.Users.qualities;

import com.mycompany.app.Users.users.User;
import com.mycompany.app.Users.users.UsersDecorator;

public class Pedido extends UsersDecorator{
    User user;

    public Pedido (User user){
        this.user = user;
    }

    public String getDescription() {
        return user.getDescription() + " realizo un pedido";
    }

    public double price() {return user.price();
    }
}