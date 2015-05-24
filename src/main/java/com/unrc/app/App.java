package com.unrc.app;

import org.javalite.activejdbc.Base;

/**
 * Connect4
 *
 */
public class App{

    public static void main( String[] args ){

        System.out.println( "Connect4" );

        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/connect4_development", "usuario", "usuario");

        User p1 = new User();
        p1.set("name", "usuario1");
        p1.set("pass", "1234");
        p1.save();

        User p2 = new User();
        p2.set("name", "usuario2");
        p2.set("pass", "2222");
        p2.save();

        Game game = new Game(p1,p2);

        Base.close();
    }
}
