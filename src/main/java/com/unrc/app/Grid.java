package com.unrc.app;

import org.javalite.activejdbc.Model;

public class Grid extends Model{

	//constantes del grid
	public static final int ROWS = 6;
	public static final int COLUMNS = 7;

	//matriz con las cells
	private Cell matrix[][];

	public Grid(Game g){
		super();
		g.add(this);
		this.save();
		this.matrix = new Cell [ROWS][COLUMNS];
		for(int r=0; r<ROWS; r++){
			for(int c=0; c<COLUMNS; c++){
				this.matrix[r][c] = null; //cada celda tiene el valor NULL
			}
		}

	}

	//devuelve matrix
	public Cell[][] getMatrix(){
		return this.matrix;
	}

	//pone en la columna c del matrix el jugador pasado
	public boolean push(int c, User player){
		if(this.fullColumn(c)){
			return false;
		}
		else{
			for(int r=ROWS-1; r>=0; r--){
				if ((this.matrix[r][c]) == null){
					  Cell fit = new Cell(this,player,r,c);
				    this.matrix[r][c] = fit;
				    //this.findWinner(f,c,player);
				    break;
				}
			}
			return true;
		}
	}

	//retorna true si la columna pasada como parametro esta completa
	private	boolean fullColumn(int c){
		return (this.matrix[0][c]!= null);
	}

}
