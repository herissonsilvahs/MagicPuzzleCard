package com.herisson.game.magicpuzzlecard.main_test;

import com.herisson.game.magicpuzzlecard.main.battlefield.BattleField;
import com.herisson.game.magicpuzzlecard.main.battlefield.Board;
import com.herisson.game.magicpuzzlecard.main.card.AttackCard;
import com.herisson.game.magicpuzzlecard.main.card.CardInterface;
import com.herisson.game.magicpuzzlecard.main.card.DefenseCard;
import com.herisson.game.magicpuzzlecard.main.player.HumanPlayer;
import com.herisson.game.magicpuzzlecard.main.player.Player;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String []args)
    {
        CardInterface staffOfAges = new AttackCard("Staff Of Ages", 1, 45.5, 1);
        CardInterface darkLimbo = new AttackCard("Dark Limbo", 1, 60, 1);
        CardInterface deadFlame = new AttackCard("Dead Flame", 1, 50.5, 1);
        CardInterface agonizingScreams = new AttackCard("Agonizing Screams", 1, 45.5, 1);
        CardInterface dyingDust = new AttackCard("Dying Dust", 1, 35, 1);
        CardInterface fireArrow = new AttackCard("Fire Arrow", 1, 60, 1);

        CardInterface fireWall = new DefenseCard("Fire Wall", 0, 75, 1);
        CardInterface iceWall = new DefenseCard("Ice Wall", 0, 75, 1);
        CardInterface cloakOfThorns = new DefenseCard("Cloak Of Thorns", 0, 100, 1);

        Map<String, CardInterface> player1Cards = new HashMap<String, CardInterface>();
        Map<String, CardInterface> player2Cards = new HashMap<String, CardInterface>();

        player1Cards.put(staffOfAges.getName(), staffOfAges);
        player1Cards.put(fireArrow.getName(), fireArrow);
        player1Cards.put(darkLimbo.getName(), darkLimbo);
        player1Cards.put(fireWall.getName(), fireWall);
        player1Cards.put(iceWall.getName(), iceWall);
        player1Cards.put(dyingDust.getName(), dyingDust);
        player1Cards.put(agonizingScreams.getName(), agonizingScreams);
        player1Cards.put(deadFlame.getName(), deadFlame);
        player1Cards.put(cloakOfThorns.getName(), cloakOfThorns);

        player2Cards.put(deadFlame.getName(), deadFlame);
        player2Cards.put(agonizingScreams.getName(), agonizingScreams);
        player2Cards.put(fireArrow.getName(), fireArrow);
        player2Cards.put(darkLimbo.getName(), darkLimbo);
        player2Cards.put(fireWall.getName(), fireWall);
        player2Cards.put(iceWall.getName(), iceWall);

        Player player1 = new HumanPlayer("Herisson", "Dark Energy", player1Cards);
        Player player2 = new HumanPlayer("Lelouch", "Magic Of Empire", player2Cards);

        Board board1 = new Board(player1, player2);

        BattleField battleField = new BattleField(player1, player2, board1);

        board1.putCard(player1, player1.getCard("Dark Limbo"));
        board1.putCard(player1, player1.getCard("Fire Wall"));

        board1.putCard(player2, player2.getCard("Dead Flame"));
        board1.putCard(player2, player2.getCard("Ice Wall"));
        //board1.putCard(player1, player1.getCard("Dying Dust"));
        //board1.putCard(player1, player1.getCard("Agonizing Screams"));
        //board1.putCard(player1, player1.getCard("Ice Wall"));
        //board1.putCard(player1, player1.getCard("Dead Flame"));
        //board1.putCard(player1, player1.getCard("Cloak Of Thorns"));

        board1.getCards(player1);
        board1.getCards(player2);
    }

}
