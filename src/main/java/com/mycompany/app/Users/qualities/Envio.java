package com.mycompany.app.Users.qualities;

import com.mycompany.app.Users.users.User;
import com.mycompany.app.Users.users.UsersDecorator;

public class Envio extends UsersDecorator{
    User user;

    public Envio (User user){
        this.user = user;
    }

    public String getDescription() {
        return user.getDescription() + " CArgo de envio";
    }

    public double price() {return user.price() + 100;
    }
}