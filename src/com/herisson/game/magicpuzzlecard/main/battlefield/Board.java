package com.herisson.game.magicpuzzlecard.main.battlefield;

import com.herisson.game.magicpuzzlecard.main.card.CardInterface;
import com.herisson.game.magicpuzzlecard.main.player.Player;

import java.util.HashMap;
import java.util.Map;

public class Board
{
    Map<Player, CardField> cardFields;

    public Board(Player player1, Player player2)
    {
        cardFields = new HashMap<Player, CardField>();
        cardFields.put(player1, new CardField(player1));
        cardFields.put(player2, new CardField(player2));

        System.out.println("Player: " + player1.getName() + "\nVida: " +
                player1.getNivel().getStamina() +
                "\nMana: " + player1.getNivel().getMana() +
                "\n==================================================");

        System.out.println("Player: " + player2.getName() + "\nVida: " +
                player2.getNivel().getStamina() +
                "\nMana: " + player2.getNivel().getMana() +
                "\n==================================================");
    }

    public void putCard(Player player, CardInterface card)
    {
        if(cardFields.get(player).put(card))
        {

        }
    }

    public void getCards(Player player)
    {
        cardFields.get(player).getCards();
    }
}
