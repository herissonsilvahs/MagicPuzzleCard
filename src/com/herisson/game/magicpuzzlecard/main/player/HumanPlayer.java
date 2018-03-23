package com.herisson.game.magicpuzzlecard.main.player;

import com.herisson.game.magicpuzzlecard.main.card.CardInterface;

import java.awt.event.KeyEvent;
import java.util.Map;

public class HumanPlayer extends Player
{
    public HumanPlayer(String name, String reino, Map<String, CardInterface> cards)
    {
        super(name, reino, cards);
    }

    @Override
    void keyPressed(KeyEvent event)
    {}

    @Override
    void keyRelease(KeyEvent event)
    {}
}
