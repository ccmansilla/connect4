package com.unrc.app;

import org.javalite.activejdbc.Model;

public class Cell extends Model{

  //estados que pueden tomar cada celda
  public static final int NONE = 0;
  public static final int PLAYER_1 = 1;
  public static final int PLAYER_2 = 2;

  public Cell(int x, int y){
    super();
    this.set("x",x);
    this.set("y",y);
    this.set("state",NONE);
    this.save();
  }

}
