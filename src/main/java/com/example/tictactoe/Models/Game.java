package com.example.tictactoe.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Game {
    private Board board;
    private List<List<Player>> players;
    public List<Move> moves;
    private int currIndex;
    private Player winner;
    private EGameState gameState;
}
