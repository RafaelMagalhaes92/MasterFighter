package io.codeforall.gameweek;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player2 extends Player {

    private Picture picture;

    public Player2(String name) {
        super(name);
        this.picture = new Picture(1300, 400, "resources/andreia.png");
        picture.draw();
    }



    @Override
    protected void updatePos() {
        x = picture.getX();
        y = picture.getY();
    }

    @Override
    protected void block() {
        isBlocking = true;
    }


    public void attack() {
        /*Player opponent = stage.opponent(this);
        if (inRange(opponent)) {
            opponent.damage(isBlocking ? attack / 2 : attack);
            Sound.attackSound();
        }*/
    }


    public void moveLeft2() {
        if(picture.getX() >= 30) {
            picture.translate(-40, 0);
            System.out.println(picture.getX());
            updatePos();
        }
    }


    public void moveRight2() {
        if(picture.getX() <= 1300) {
            picture.translate(40, 0);
            updatePos();
        }
    }
}