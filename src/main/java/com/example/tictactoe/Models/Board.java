package com.example.tictactoe.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Board {

    private int size;
    private List<List<Cell>> board;
}
