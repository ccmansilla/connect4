package com.unrc.app;

import org.javalite.activejdbc.Model;

public class User extends Model {
   static {
    validatePresenceOf("name");
    validatePresenceOf("pass");
  }

}
