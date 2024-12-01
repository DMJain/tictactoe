package org.tictactoe.strategies.winningstrategy;

import org.tictactoe.models.Board;
import org.tictactoe.models.Cell;
import org.tictactoe.models.Player;

public interface WinningStrategy {
    boolean checkWinner(Board board, Player player, Cell cell);
}
