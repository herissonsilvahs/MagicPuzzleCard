package com.herisson.game.magicpuzzlecard.main.commons;

public class GameControls implements GameControlsInterface{

    boolean endGame;
    boolean loadMana;
    String graphics_folder = "../resources/";

    public GameControls()
    {
        this.endGame = false;
        this.loadMana = false;
    }

    public void setEndGame(boolean endGame)
    {
        this.endGame = endGame;
    }

    public boolean getEndGame()
    {
        return this.endGame;
    }

    public boolean getLoadMana()
    {
        return loadMana;
    }

    public void setLoadMana(boolean loadMana)
    {
        this.loadMana = loadMana;
    }
}
