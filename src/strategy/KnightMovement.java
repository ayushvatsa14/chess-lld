package strategy;

import entity.Board;

public class KnightMovement implements MovementStrategy{
    @Override
    public boolean canMove(Board board, int fromRow, int fromCol, int toRow, int toCol) {
        return false;
    }
}
