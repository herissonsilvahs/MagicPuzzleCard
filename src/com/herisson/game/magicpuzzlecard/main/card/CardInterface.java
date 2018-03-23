package com.herisson.game.magicpuzzlecard.main.card;

public interface CardInterface
{
    int getCategory();

    String getName();

    double getPower();

    int getNivel();

    boolean isAvailable();

    void setAvailable(boolean available);

    int getOnHold();

    void setOnHold(int onHold);

    boolean isSelected();

    void setSelected(boolean selected);
}
