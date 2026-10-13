package strategy;

import entity.Board;

public interface MovementStrategy {
    public boolean canMove(Board board, int fromRow, int fromCol, int toRow, int toCol);
}
