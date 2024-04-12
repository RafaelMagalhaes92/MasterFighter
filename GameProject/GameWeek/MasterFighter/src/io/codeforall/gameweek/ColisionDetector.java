package io.codeforall.gameweek;

public class ColisionDetector {

    Player player1;
    Player player2;

    public ColisionDetector(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.init();
    }


    public void init() {

    }

    public boolean checkColision() {
        //Condition of colision
        /*if(player1.getX == player2.getX) {
            return true;
        }*/
        return false;
    }
}
