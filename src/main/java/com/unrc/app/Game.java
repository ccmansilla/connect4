package com.unrc.app;

import org.javalite.activejdbc.Model;

public class Game  extends Model{

  private Grid last_grid;
  private User player1;
  private User player2;
  private User turn;
  private User winner;

  public Game(User p1, User p2){
    super();
    this.save();
    this.add(p1);
    this.add(p2);
    this.player1=p1;
    this.player2=p2;
    this.start();
  }

  private void start(){
    this.last_grid = new Grid(this);
    this.turn=this.player1;
    this.push(3);
    this.push(3);
    this.draw();
  }

  private void toogleTurn(){
    if(this.turn==this.player1){
      this.turn = this.player2;
    }
    else{
      this.turn = this.player1;
    }
  }

  private void push(int c){
    if(this.last_grid.push(c,this.turn)){
      this.toogleTurn();
      //puso el jugador y cambia el turno
    }
    else{
      //no se puede poner mas en esta columna
    }
  }

  private void draw(){
    Cell matrix[][] = this.last_grid.getMatrix();
    String tablero = "---------------\n";
    for(int r=0; r<Grid.ROWS; r++){
			for(int c=0; c<Grid.COLUMNS; c++){
        Cell cell = matrix[r][c];
        if(cell == null){
          tablero+= "| ";
        }
        else{
          Integer id = (cell.parent(User.class)).getInteger("id");
          if(id == this.player1.getInteger("id")){
            tablero+= "|O";
          }
          else{
            tablero+= "|X";
          }
        }
			}
			tablero+= "|\n---------------\n";
		}
		System.out.println(tablero);
  }

}
