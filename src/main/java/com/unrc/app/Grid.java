package com.unrc.app;


import org.javalite.activejdbc.Model;

public class Grid extends Model{

	//constantes del grid
	public static final int ROWS = 6;
	public static final int COLUMNS = 7;

	public Grid(){
		super();
		this.save();
		for(int r=0; r<ROWS; r++){
      for(int c=0; c<COLUMNS; c++){
        Cell cell = new Cell(r,c); //crea la celda
				this.add(cell); //agrega la celda al grid
      }
    }
	}

}
