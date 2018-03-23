package com.herisson.game.magicpuzzlecard.main.battlefield;

import com.herisson.game.magicpuzzlecard.main.card.CardInterface;
import com.herisson.game.magicpuzzlecard.main.player.Player;

import java.util.HashMap;
import java.util.Map;

public class CardField
{
    private int cardQuantity;
    private Player player;
    private Map<String, CardInterface> cards;
    private int attackCards;
    private int defenseCards;

    public CardField(Player player)
    {
        cardQuantity = 0;
        attackCards = 0;
        defenseCards = 0;
        cards = new HashMap<String, CardInterface>();
        this.player = player;
    }

    protected boolean put(CardInterface card)
    {
        if(cardQuantity < 6 && !card.isSelected())
        {

            if(card.getCategory() == 0 && attackCards < 1)
            {
                System.out.println("Deve haver pelo menos uma carta de ataque em campo");
                return false;
            }

            if(card.getCategory() == 0 && defenseCards >= 2)
            {
                System.out.println("Numero maximo de cartas de defesa permitido é 2");
                return false;
            }

            cards.put(card.getName(), card);

            card.setSelected(true);

            if(card.getCategory() == 0)
                defenseCards++;
            else if(card.getCategory() == 1)
                attackCards++;

            cardQuantity++;
        }

        return true;
    }

    protected void pop(CardInterface card)
    {}

    public void getCards()
    {
        System.out.println("Player: " + player.getName());
        for (Map.Entry<String, CardInterface> card : cards.entrySet())
        {
            System.out.println("Card: " + card.getValue().getName());
        }
        System.out.println("=============================================");
    }
}
