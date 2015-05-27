package com.unrc.app;

import org.javalite.activejdbc.Model;

public class Cell extends Model{

  public Cell(Grid g, User u, int r, int c){
    super();
    this.set("row",r);
    this.set("col",c);
    g.add(this);
    u.add(this);
    this.save();
  }

}
