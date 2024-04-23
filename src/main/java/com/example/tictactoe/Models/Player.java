package com.example.tictactoe.Models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    private String name;
    private Symbol symbol;
    private EPlayerState playerState;

}
