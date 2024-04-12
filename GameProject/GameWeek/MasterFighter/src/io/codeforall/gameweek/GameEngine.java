package io.codeforall.gameweek;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class GameEngine {

    Stage stage = new Stage();
    Player1 player1 = new Player1("Gustavo");
    Player2 player2 = new Player2("Andreia");

    ColisionDetector colisionDetector = new ColisionDetector(player1, player2);

    InputHandler inputHandler = new InputHandler(player1, player2);



}



