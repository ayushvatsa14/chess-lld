package entity;

import strategy.QueenMovement;

public class Queen extends Piece{
    public Queen(Color color, QueenMovement movementStrategy) {
        super(color, movementStrategy);
    }
}
