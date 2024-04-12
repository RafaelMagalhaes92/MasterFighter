package io.codeforall.gameweek;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player1 extends Player {

    private Picture picture;

    public Player1(String name) {
        super(name);
        this.picture = new Picture(30, 400, "resources/teste.png");
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


    public void moveLeft() {
        if(picture.getX() >= 40) {
            picture.translate(-40, 0);
            System.out.println(picture.getX());
            updatePos();
        }
    }


    public void moveRight() {
        if(picture.getX() <= 1000) {
            picture.translate(40, 0);
            updatePos();
        }
    }
}