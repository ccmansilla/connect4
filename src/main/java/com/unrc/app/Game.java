package com.unrc.app;

public class Game{

  //atributos de Game
  private Grid grid = null; // cada celda del matrix contiene uno de los valores: NONE, PLAYER_1, PLAYER_2
  private User player1 = null;
  private User player2 = null;

  public Game(User player1, User player2){
    this.player1 = player1;
    this.player2 = player2;
    this.grid = new Grid();
    this.grid.add(player1);
    this.grid.add(player2);
  }
}
