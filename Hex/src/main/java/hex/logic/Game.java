/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hex.logic;

import hex.domain.HexColor;
import hex.domain.Player;

/**
 * Class presenting a single game.
 *
 * Takes care of game setup, handling turns etc.
 *
 * @author akir
 */
public class Game {

    private Board board;
    private Player red;
    private Player blue;
    private Player currentPlayer;

    public Game(int size) {
        board = new Board(size);
        red = new Player("Red", HexColor.RED);
        blue = new Player("Blue", HexColor.BLUE);
        currentPlayer = red;
    }

    public HexColor getCurrentPlayerColor() {
        return currentPlayer.getColor();
    }

    public boolean playAt(int x, int y) {
        if (!board.isFree(x, y)) {
            return false;
        }
        board.playAt(currentPlayer, x, y);
        switchTurns();
        return true;
    }

    private void switchTurns() {
        if (currentPlayer.getColor() == HexColor.BLUE) {
            currentPlayer = red;
        } else {
            currentPlayer = blue;
        }
    }
}
