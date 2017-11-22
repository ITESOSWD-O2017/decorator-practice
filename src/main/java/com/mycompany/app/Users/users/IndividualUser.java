package com.mycompany.app.Users.users;
import com.mycompany.app.Users.qualities.DescuentoDiam;
import com.mycompany.app.Users.qualities.DescuentoSilv;
import com.mycompany.app.Users.qualities.Envio;
import com.mycompany.app.Users.qualities.Pedido;

public class IndividualUser {
    public static void main(String[] args){
        User user1 = new UserNormal();
        System.out.println(user1.getDescription());

        user1 = new Pedido(user1);
        user1 = new Envio(user1);

        System.out.println(user1.getDescription());
        System.out.println("$" + user1.price());

        User user2 = new UserSilver();

        user2 = new Pedido(user2);
        user2 = new DescuentoSilv(user2);
        user2 = new Envio(user2);

        System.out.println();
        System.out.println(user2.getDescription());
        System.out.println("$" + user2.price());

        User user3 = new UserGold();

        user3 = new Pedido(user3);

        System.out.println();
        System.out.println(user3.getDescription());
        System.out.println("$" + user3.price() + "El usuario cuenta con Amazon Prime, no se cobra envio");

        User user4 = new UserPlat();

        user4 = new Pedido(user4);
        user4 = new DescuentoDiam(user4);

        System.out.println();
        System.out.println(user4.getDescription());
        System.out.println("$" + user4.price() + "El usuario cuenta con Amazon Prime, no se cobra envio y con descuento diamond");


    }
}