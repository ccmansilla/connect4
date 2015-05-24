package com.unrc.app;

import com.unrc.app.User;
import org.javalite.activejdbc.Base;

/**
 * Connect4
 *
 */
public class App{

    public static void main( String[] args ){

        System.out.println( "Connect4" );

        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/connect4_development", "usuario", "usuario");

        User u = new User();
        u.set("name", "usuario");
        u.set("pass", "1234");
        u.save();


        Base.close();
    }
}
