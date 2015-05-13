package com.unrc.app;

import org.javalite.activejdbc.Model;

public class Rank extends Model {
   static {
    validatePresenceOf("order_history");
    validatePresenceOf("points");
  }

}
