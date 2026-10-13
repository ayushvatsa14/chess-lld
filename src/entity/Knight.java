package entity;

import strategy.KnightMovement;

public class Knight extends Piece{
    public Knight(Color color, KnightMovement movementStrategy) {
        super(color, movementStrategy);
    }
}
