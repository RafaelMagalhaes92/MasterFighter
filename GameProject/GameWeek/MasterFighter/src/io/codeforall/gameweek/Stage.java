package io.codeforall.gameweek;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Stage {

    private final int maxHealth = 100;
    private int player1Health = maxHealth;
    private int player2Health = maxHealth;
    private int player1RoundsWon = 0;
    private int player2RoundsWon = 0;


    private Picture background = new Picture(10,10,"resources/background1.jpeg");

    public Stage() {
        runGame();
        background.draw();
    }

    public void runGame() {
        /*while (true) {
            drawStage();
            checkRoundOutcome();
            checkGameOutcome();
        }*/
    }
    private void drawStage() {


    }

    private void checkRoundOutcome() {
        if (player1Health <= 0) {
            player2RoundsWon++;
            resetRound();
            System.out.println("Player 2 wins the round!"); // Draw text box or something
        } else if (player2Health <= 0) {
            player1RoundsWon++;
            resetRound();
            System.out.println("Player 1 wins the round!"); // Draw text box or something
        }
    }

    private void checkGameOutcome() {
        int maxRounds = 2;
        if (player1RoundsWon >= maxRounds) {
            // Insert text box "Player 1 wins the game!"
            // Game ends
        } else if (player2RoundsWon >= maxRounds) {
            // Insert text box "Player 2 wins the game!"
            // Game ends
        }
    }

    private void resetRound() {
        player1Health = maxHealth;
        player2Health = maxHealth;
    }
}




