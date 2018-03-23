package com.herisson.game.magicpuzzlecard.main.battlefield;

import com.herisson.game.magicpuzzlecard.main.player.Player;

public class BattleField
{
    Player player1;
    Player player2;
    Board board;

    public BattleField(Player player1, Player player2, Board board)
    {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }
}
