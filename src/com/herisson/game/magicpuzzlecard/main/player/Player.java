package com.herisson.game.magicpuzzlecard.main.player;

import com.herisson.game.magicpuzzlecard.main.card.CardInterface;
import com.herisson.game.magicpuzzlecard.main.commons.PlayerCommons;
import com.herisson.game.magicpuzzlecard.main.graphics.Drawing;
import com.herisson.game.magicpuzzlecard.main.player.nivel.Nivel;

import java.awt.event.KeyEvent;
import java.util.Map;

public abstract class Player extends Drawing implements PlayerCommons
{
    private String name;
    private String reino;
    private Nivel nivel;
    private Map<String, CardInterface> cards;

    Player(final String name,
           final String reino,
           final Map<String, CardInterface> cards)
    {
        this.name = name;
        this.nivel = new Nivel(STAMINA, MANA, NIVEL);
        this.cards = cards;
        this.reino = reino;
    }

    public String getName()
    {
        return name;
    }

    public String getReino()
    {
        return reino;
    }

    public Map<String ,CardInterface> getCards()
    {
        return cards;
    }

    public CardInterface getCard(String name)
    {
        return this.cards.get(name);
    }

    /*
        Poder atual referente ao nivel do jogador
     */
    public int getActualPower()
    {
        int ap = ((int) (POWER + (POWER * (0.2 * nivel.getNivel()))));
        return ap;
    }

    public Nivel getNivel()
    {
        return nivel;
    }

    public void setNivel(Nivel nivel)
    {
        this.nivel = nivel;
    }

    abstract void keyPressed(KeyEvent event);

    abstract void keyRelease(KeyEvent event);
}
