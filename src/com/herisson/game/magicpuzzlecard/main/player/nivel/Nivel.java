package com.herisson.game.magicpuzzlecard.main.player.nivel;

public class Nivel
{
    private int nivel;
    private double stamina, mana;

    public Nivel(final double stamina, final double mana, final int nivel)
    {
        this.nivel = nivel;
        this.stamina = stamina;
        this.mana = mana;
    }

    public int getNivel()
    {
        return nivel;
    }

    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }

    public double getStamina()
    {
        return stamina;
    }

    public void setStamina(double stamina)
    {
        this.stamina = stamina;
    }

    public double getMana()
    {
        return mana;
    }

    public void setMana(double mana)
    {
        this.mana = mana;
    }
}
