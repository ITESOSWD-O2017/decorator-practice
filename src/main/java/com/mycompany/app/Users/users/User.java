package com.mycompany.app.Users.users;

public abstract class User {
    public String description = "A User";
    public String getDescription(){
        return description;
    }
    public abstract double price();
}