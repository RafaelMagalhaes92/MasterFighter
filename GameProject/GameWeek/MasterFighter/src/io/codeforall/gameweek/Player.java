package io.codeforall.gameweek;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Player{
    protected int health;
    protected int attack;
    protected int x;
    protected int y;
    protected String name;
    protected boolean isBlocking = false;

    protected Stage stage;

    public Player(String name) {
        this.health = 100;
        this.attack = 5;
        this.name = name;
    }



    protected abstract void updatePos();
    protected abstract void block();

    protected void damage(int amount) {
        health -= amount;
        //stage.healthBar(health);
    }

   /* public void attack(Player opponent) {
        opponent.damage(inRange(opponent) ? (isBlocking ? attack / 2 : attack) : 0);
        sound.attackSound();
    }*/

    protected boolean inRange(Player opponent) {
        double distance = Math.sqrt(Math.pow(this.x - opponent.x, 2) + Math.pow(this.y - opponent.y, 2));
        double attackRange = 30;
        return distance <= attackRange;
    }
}