package com.herisson.game.magicpuzzlecard.main.card;

public class DefenseCard implements CardInterface
{
    private int category; // Attack == 1 : defence == 0
    private String name;
    private double power;
    private int nivel;
    private boolean available;
    private int onHold;
    private boolean selected;

    public DefenseCard(final String name, final int category, final double power, final int nivel)
    {
        this.name = name;
        this.category = category;
        this.power = power;
        this.nivel = nivel;
        this.available = true;
    }

    @Override
    public int getCategory()
    {
        return category;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public double getPower()
    {
        return power;
    }

    @Override
    public int getNivel()
    {
        return nivel;
    }

    @Override
    public boolean isAvailable()
    {
        return available;
    }

    @Override
    public void setAvailable(boolean available)
    {
        this.available = available;
    }

    @Override
    public int getOnHold()
    {
        return onHold;
    }

    @Override
    public void setOnHold(int onHold)
    {
        this.onHold = onHold;
    }

    @Override
    public boolean isSelected()
    {
        return selected;
    }

    @Override
    public void setSelected(boolean selected)
    {
        this.selected = selected;
    }
}
