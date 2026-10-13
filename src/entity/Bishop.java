package entity;

import strategy.BishopMovement;

public class Bishop extends Piece{
    public Bishop(Color color, BishopMovement movementStrategy) {
        super(color, movementStrategy);
    }
}
